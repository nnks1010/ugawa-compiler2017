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
main:
	@ prologue
	str r11, [sp, #-4]!
	mov r11, sp
	str r14, [sp, #-4]!
	str r1, [sp, #-4]!
	mov r1, #0
	str r1, [r11, #-12]
	str r1, [r11, #-16]
	ldr r1, [sp], #4
	str r1, [sp, #-4]!
	sub sp, sp, #8
	ldr r0, =#10
	str r0, [r11, #-12]
L1:
	ldr r0, [r11, #-12]
	cmp r0, #0
	beq L2
	ldr r0, [r11, #-12]
	str r1, [sp, #-4]!
	mov r1, r0
	ldr r0, =#1
	sub r0, r1, r0
	ldr r1, [sp], #4
	str r0, [r11, #-12]
	ldr r0, [r11, #-12]
	str r1, [sp, #-4]!
	mov r1, r0
	ldr r0, =#5
	cmp r0, r1
	movgt r0, #1
	movle r0, #0
	ldr r1, [sp], #4
	cmp r0, #0
	beq L3
	b L1
	b L4
L3:
	ldr r0, [r11, #-16]
	str r1, [sp, #-4]!
	mov r1, r0
	ldr r0, =#1
	add r0, r1, r0
	ldr r1, [sp], #4
	str r0, [r11, #-16]
L4:
	ldr r0, [r11, #-12]
	bl _print_r0
	b L1
L2:
	ldr r0, [r11, #-16]
	b L0
	mov r0, #0
L0:
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
L5:
	cmp r0, #0
	beq L6
	mov r2, #16
	udiv r1, r0, r2
	mul r2, r1, r2
	sub r0, r0, r2
	cmp r0, #10
	bpl L7
	add r0, r0, #48
	b L8
L7:
	add r0, r0, #55
L8:
	strb r0, [r7], #-1
	mov r0, r1
	b L5
L6:
	mov r7, #4
	mov r0, #1
	ldr r1, =hex
	ldr r2, =hexlen
	swi #0
	mov r0, #48
	mov r2, #8
L9:
	cmp r2, #0
	beq L10
	sub r2, r2, #1
	strb r0, [r1, r2]
	b L9
L10:
	ldr r7, [sp], #4
	ldr r2, [sp], #4
	ldr r1, [sp], #4
	ldr r0, [sp], #4
	bx r14
