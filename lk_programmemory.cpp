//lk_programmemory 
//2018年3月13日15点14分
//
#include "systemc.h"
#include "lk_config.h"
SC_MODULE (lk_programmemory)
{
	sc_in<sc_uint<LK_COUNTER_ADDRESSING_BIT_NUMBER> > pm_address;
	sc_out<sc_uint<LK_PM_INSBIT> > pm_instr;
	
	sc_uint<LK_PM_INSBIT> pm_reg;
	
	void programmemory()
	{
		switch(pm_address.read())
		{
			case 0	:	break;
			case 1	:	break;
			default	:	break;
		}
		pm_instr.write(pm_reg);
	}
	SC_CTOR	(lk_programmemory)
	{
		SC_METHOD	(programmemory);
		sensitive	<< pm_address; //<//
	}
};//do not miss ;
