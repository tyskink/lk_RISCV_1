//lk_registers.cpp
//2018年3月14日 14点47分
#include "systemc.h"
#include "lk_config.h"
#include "lk_instset_riscv_v1.h"
SC_MODULE(lk_registers)
{	sc_in_clk clock;
	sc_in<sc_logic >reset;
	sc_in<sc_uint<LK_PM_INS_ADRBIT> >rs1,rs2,rd;
	sc_in<sc_uint<LK_REG_CONTROL_BITNUM> >ctrl;	//control signal for register
	sc_in<sc_uint<LK_REG_REGBIT> >datain;
	sc_out<sc_uint<LK_REG_REGBIT> >rs1_o,rs2_o;
	
	sc_uint<LK_REG_REGBIT> x[LK_REG_REGBIT];
	void reg()
	{
		rs1_o.write(0);
		rs2_o.write(0);
		if (reset.read()==0)
		{
			 for(int i=0;i<LK_REG_REGBIT;i++)
			 {
				x[i]=0;
			 }
		}
		else
		{

			switch(ctrl.read())
			{
				case	LK_REG_CONTROL_NON:	break ;
				case	LK_REG_CONTROL_RED:	rs1_o.write(x[rs1.read()]);
											rs2_o.write(x[rs2.read()]);
											break ;
				case	LK_REG_CONTROL_WRT:	x[rd.read()]=datain.read();
											break ;
				case	LK_REG_CONTROL_RAW:	rs1_o.write(x[rs1.read()]);
											rs2_o.write(x[rs2.read()]);
											x[rd.read()]=datain.read();
											break ;
				default :	break ;
			}
		}
	}
	
	SC_CTOR (lk_registers)
	{
		SC_METHOD(reg);
		sensitive<<clock.pos();
		sensitive<<reset.neg();
	}
};//newline
