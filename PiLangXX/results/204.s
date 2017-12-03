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
	ldr r1, [sp], #4
	str r1, [sp, #-4]!
	sub sp, sp, #4
	ldr r0, =#5
	str r0, [r11, #-12]
L1:
	ldr r0, [r11, #-12]
	cmp r0, #0
	beq L2
	ldr r0, =#1
	bl _print_r0
L3:
	ldr r0, [r11, #-12]
	cmp r0, #0
	beq L4
	ldr r0, =#2
	bl _print_r0
L5:
	ldr r0, [r11, #-12]
	cmp r0, #0
	beq L6
	ldr r0, =#3
	bl _print_r0
L7:
	ldr r0, [r11, #-12]
	cmp r0, #0
	beq L8
	ldr r0, =#4
	bl _print_r0
L9:
	ldr r0, [r11, #-12]
	cmp r0, #0
	beq L10
	ldr r0, =#5
	bl _print_r0
	b L10
	ldr r0, =#255
	bl _print_r0
	b L9
L10:
	ldr r0, =#4
	bl _print_r0
	b L8
	ldr r0, =#255
	bl _print_r0
	b L7
L8:
	ldr r0, =#3
	bl _print_r0
	b L6
	ldr r0, =#255
	bl _print_r0
	b L5
L6:
	ldr r0, =#2
	bl _print_r0
	b L4
	ldr r0, =#255
	bl _print_r0
	b L3
L4:
	ldr r0, =#1
	bl _print_r0
	b L2
	ldr r0, =#255
	bl _print_r0
	b L1
L2:
	mov r0, #0
L0:
	@ epilogue
	add sp, sp, #4
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
L11:
	cmp r0, #0
	beq L12
	mov r2, #16
	udiv r1, r0, r2
	mul r2, r1, r2
	sub r0, r0, r2
	cmp r0, #10
	bpl L13
	add r0, r0, #48
	b L14
L13:
	add r0, r0, #55
L14:
	strb r0, [r7], #-1
	mov r0, r1
	b L11
L12:
	mov r7, #4
	mov r0, #1
	ldr r1, =hex
	ldr r2, =hexlen
	swi #0
	mov r0, #48
	mov r2, #8
L15:
	cmp r2, #0
	beq L16
	sub r2, r2, #1
	strb r0, [r1, r2]
	b L15
L16:
	ldr r7, [sp], #4
	ldr r2, [sp], #4
	ldr r1, [sp], #4
	ldr r0, [sp], #4
	bx r14
