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
	sub sp, sp, #0
	ldr r0, =#7
	str r1, [sp, #-4]!
	mov r1, r0
	ldr r0, =#3
	str r1, [sp, #-4]!
	mov r1, r0
	ldr r0, =#1
	and r0, r1, r0
	ldr r1, [sp], #4
	orr r0, r1, r0
	ldr r1, [sp], #4
	b L0
	mov r0, #0
L0:
	@ epilogue
	add sp, sp, #0
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
L1:
	cmp r0, #0
	beq L2
	mov r2, #16
	udiv r1, r0, r2
	mul r2, r1, r2
	sub r0, r0, r2
	cmp r0, #10
	bpl L3
	add r0, r0, #48
	b L4
L3:
	add r0, r0, #55
L4:
	strb r0, [r7], #-1
	mov r0, r1
	b L1
L2:
	mov r7, #4
	mov r0, #1
	ldr r1, =hex
	ldr r2, =hexlen
	swi #0
	mov r0, #48
	mov r2, #8
L5:
	cmp r2, #0
	beq L6
	sub r2, r2, #1
	strb r0, [r1, r2]
	b L5
L6:
	ldr r7, [sp], #4
	ldr r2, [sp], #4
	ldr r1, [sp], #4
	ldr r0, [sp], #4
	bx r14
