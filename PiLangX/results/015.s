	.section .data
	@ 大域変数の定義
hex:
	.ascii "00000000\n"
	.equ hexlen, . - hex
	.section .text
	.global _start
_start:
	@ main関数を呼出す．戻り値は r0 に入る
	bl main
	@ EXITシステムコール
	mov r7, #1
	swi #0
z:
	@ prologue
	str r11, [sp, #-4]!
	mov r11, sp
	str r14, [sp, #-4]!
	str r1, [sp, #-4]!
	sub sp, sp, #4
	ldr r0, =#1
	str r0, [r11, #-12]
	ldr r0, [r11, #-12]
	b L0
	mov r0, #0
L0:
	@ epilogue
	add sp, sp, #4
	ldr r1, [sp], #4
	ldr r14, [sp], #4
	ldr r11, [sp], #4
	bx r14
main:
	@ prologue
	str r11, [sp, #-4]!
	mov r11, sp
	str r14, [sp, #-4]!
	str r1, [sp, #-4]!
	sub sp, sp, #8
	ldr r0, =#100
	str r0, [r11, #-12]
	bl z
	add sp, sp, #0
	str r0, [r11, #-16]
	ldr r0, [r11, #-12]
	str r1, [sp, #-4]!
	mov r1, r0
	ldr r0, [r11, #-16]
	add r0, r1, r0
	ldr r1, [sp], #4
	b L1
	mov r0, #0
L1:
	@ epilogue
	add sp, sp, #8
	ldr r1, [sp], #4
	ldr r14, [sp], #4
	ldr r11, [sp], #4
	bx r14
_print_r0:
	str r0, [sp, #-4]!
	str r1, [sp, #-4]!
	str r2, [sp, #-4]!
	str r7, [sp, #-4]!
	ldr r7, =hex
	add r7, r7, #7
L2:
	cmp r0, #0
	beq L3
	mov r2, #16
	udiv r1, r0, r2
	mul r2, r1, r2
	sub r0, r0, r2
	cmp r0, #10
	bpl L4
	add r0, r0, #48
	b L5
L4:
	add r0, r0, #55
L5:
	strb r0, [r7], #-1
	mov r0, r1
	b L2
L3:
	mov r7, #4
	mov r0, #1
	ldr r1, =hex
	ldr r2, =hexlen
	swi #0
	mov r0, #48
	mov r2, #8
L6:
	cmp r2, #0
	beq L7
	sub r2, r2, #1
	strb r0, [r1, r2]
	b L6
L7:
	ldr r7, [sp], #4
	ldr r2, [sp], #4
	ldr r1, [sp], #4
	ldr r0, [sp], #4
	bx r14
