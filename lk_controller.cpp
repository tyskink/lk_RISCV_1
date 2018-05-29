//lk_controller.h
//11点35分 2018年3月16日
#include "systemc.h"
#include "lk_config.h"
#include "lk_instset_riscv_v1.h"

SC_MODULE(lk_controller)
{
	sc_in<sc_uint<LK_INS_OPCODEBIT> >opcode;
	
	//control signals
	sc_out<sc_uint<LK_COUNT_CONTROL_BITNUM> >ctrl_counter;
	sc_out<sc_uint<LK_REG_CONTROL_BITNUM> >ctrl_register;
	sc_out<sc_uint<LK_ALU_CONTROL_BITNUM> >ctrl_alu;
	
	SC_CTOR(lk_controller)
	{
		
	}
};//new line
