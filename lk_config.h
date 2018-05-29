//lk_config.h
//2018年3月14日16点02分
#ifndef LK_CONGIF_H
#define LK_CONGIF_H
	//config the instruction format RISCV 32I
		#define LK_INS_OPCODEBIT 7
		
		
	//config the lk_counter MODULE
		#define LK_COUNTER_ADDRESSING_BIT_NUMBER 32	//RISC-V:	pc register is 32bit register
		//for control signals
		#define LK_COUNT_CONTROL_BITNUM 2
		#define LK_COUNT_CONTROL_WAIT 0
		#define LK_COUNT_CONTROL_INCR1 1
		#define LK_COUNT_CONTROL_DIREC 2
		#define LK_COUNT_CONTROL_RELAT 3
		
	//config the lk_programmemory moduel
		#define LK_PM_INSBIT 32	//RISC-V:	32bit instruction
		#define LK_PM_INS_ADRBIT 5
	

	//config the lk_registers moduel
		#define LK_REG_REGBIT	32
		#define LK_REG_REGNUM	32
		//for control signals
		#define LK_REG_CONTROL_BITNUM 2
		#define LK_REG_CONTROL_NON 0	//DO NOTHING
		#define LK_REG_CONTROL_RED 1	//READ from rs1 and rs2
		#define LK_REG_CONTROL_WRT 2	//WRITE to rd
		#define LK_REG_CONTROL_RAW 3	//read and write
		
		
	//config the ALU module
		#define LK_ALU_CONTROL_BITNUM 2
		
	
	//
		
		
#endif		

