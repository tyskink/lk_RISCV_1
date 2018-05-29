@0;moduleinfo.sc;5;17;0;gnuc;4;2;0

F4;C:\Users\lk2v17\OneDrive - University of Southampton\SystemC\ModelSim\trying\lk_RISCV_1\testbench.cpp
F3;C:/Users/lk2v17/OneDrive - University of Southampton/SystemC/ModelSim/trying/lk_RISCV_1/lk_programmemory.cpp
F2;C:\Users\lk2v17\OneDrive - University of Southampton\SystemC\ModelSim\trying\lk_RISCV_1\lk_counter.cpp
F1;C:/Users/lk2v17/OneDrive - University of Southampton/SystemC/ModelSim/trying/lk_RISCV_1/lk_controller.cpp
F0;C:/Users/lk2v17/OneDrive - University of Southampton/SystemC/ModelSim/trying/lk_RISCV_1/lk_registers.cpp


T14;bool;12;134217728;1;1;0;0;<NONE>

M13;lk_controller;19;134230016;576;576;0;0;lk_controller.dbs;F1;L7
B0;sc_core::sc_module;256;0;<NONE>;M6
P0;opcode;12;132;lk_controller.dbs;T1;F1;L9
P0;ctrl_counter;20;240;lk_controller.dbs;T5;F1;L12
P0;ctrl_register;20;352;lk_controller.dbs;T5;F1;L13
P0;ctrl_alu;20;464;lk_controller.dbs;T5;F1;L14
N0;lk_controller;(sc_core::sc_module_name);lk_controller.dbs;F1;L17

M12;lk_counter;19;134230016;728;728;0;0;testbench.dbs;F2;L6
B0;sc_core::sc_module;256;0;<NONE>;M6
P0;clock;12;132;testbench.dbs;T14;F2;L8
P0;reset;12;248;testbench.dbs;T8;F2;L9
P0;count_ctrl;12;364;testbench.dbs;T5;F2;L10
P0;count_data;12;472;testbench.dbs;T4;F2;L11
P0;count_out;20;580;testbench.dbs;T4;F2;L12
V0;count_buf;0;696;testbench.dbs;T4;F2;L14
N0;count;();testbench.dbs;F2;L17
N0;lk_counter;(sc_core::sc_module_name);testbench.dbs;F2;L40

M11;lk_programmemory;19;12288;384;384;0;0;lk_programmemory.dbs;F3;L6
B0;sc_core::sc_module;256;0;<NONE>;M6
P0;pm_address;12;132;lk_programmemory.dbs;T4;F3;L8
P0;pm_instr;20;240;lk_programmemory.dbs;T4;F3;L9
V0;pm_reg;0;352;lk_programmemory.dbs;T4;F3;L11
N0;lk_programmemory;(sc_core::sc_module_name);lk_programmemory.dbs;F3;L24
N0;programmemory;();lk_programmemory.dbs;F3;L14

M10;lk_registers;19;134230016;2152;2152;0;0;lk_registers.dbs;F0;L6
B0;sc_core::sc_module;256;0;<NONE>;M6
P0;clock;12;132;lk_registers.dbs;T14;F0;L7
P0;reset;12;248;lk_registers.dbs;T8;F0;L8
P0;rs1;12;364;lk_registers.dbs;T2;F0;L9
P0;rs2;12;472;lk_registers.dbs;T2;F0;L9
P0;rd;12;580;lk_registers.dbs;T2;F0;L9
P0;ctrl;12;688;lk_registers.dbs;T5;F0;L10
P0;datain;12;796;lk_registers.dbs;T4;F0;L11
P0;rs1_o;20;904;lk_registers.dbs;T4;F0;L12
P0;rs2_o;20;1016;lk_registers.dbs;T4;F0;L12
V0;x;0;1128;lk_registers.dbs;T3;F0;L14
N0;lk_registers;(sc_core::sc_module_name);lk_registers.dbs;F0;L47
N0;reg;();lk_registers.dbs;F0;L16

T9;sc_clock;30;134217728;0;0;0;0;<NONE>

T8;sc_logic;14;134221824;1;12;0;0;<NONE>

M7;sc_main;19;134226048;0;0;0;0;testbench.dbs;F4;L6
S0;clock;2;0;testbench.dbs;T9;F4;L9
S0;reset;2;0;testbench.dbs;T8;F4;L10
S0;count_ctrl;2;0;testbench.dbs;T5;F4;L12
S0;count_data;2;0;testbench.dbs;T4;F4;L13
S0;count_out;2;0;testbench.dbs;T4;F4;L14
C0;counter;1;0;testbench.dbs;M12;F4;L17

M6;sc_module;19;4352;0;0;0;0;<NONE>

T5;sc_uint<2>;17;134222336;2;32;0;0;<NONE>

T4;sc_uint<32>;17;4608;32;32;0;0;<NONE>

T3;sc_uint<32>[32];20;134225920;32;1024;32;0;<NONE>;T4

T2;sc_uint<5>;17;134222336;5;32;0;0;<NONE>

T1;sc_uint<7>;17;134222336;7;32;0;0;<NONE>

T0;sc_uint<8>;17;134287872;8;0;0;0;<NONE>

