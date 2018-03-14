@0;moduleinfo.sc;5;17;0;gnuc;4;2;0

F2;C:/Users/lk2v17/OneDrive - University of Southampton/SystemC/ModelSim/trying/lk_RISCV_1/testbench.cpp
F1;C:/Users/lk2v17/OneDrive - University of Southampton/SystemC/ModelSim/trying/lk_RISCV_1/lk_programmemory.cpp
F0;C:/Users/lk2v17/OneDrive - University of Southampton/SystemC/ModelSim/trying/lk_RISCV_1/lk_counter.cpp


T9;bool;12;134217728;1;1;0;0;<NONE>

M8;lk_counter;19;134230016;728;728;0;0;testbench.dbs;F0;L6
B0;sc_core::sc_module;256;0;<NONE>;M3
P0;clock;12;132;testbench.dbs;T9;F0;L8
P0;reset;12;248;testbench.dbs;T5;F0;L9
P0;count_ctrl;12;364;testbench.dbs;T2;F0;L10
P0;count_data;12;472;testbench.dbs;T0;F0;L11
P0;count_out;20;580;testbench.dbs;T0;F0;L12
V0;count_buf;0;696;testbench.dbs;T0;F0;L14
N0;count;();testbench.dbs;F0;L17
N0;lk_counter;(sc_core::sc_module_name);testbench.dbs;F0;L40

M7;lk_programmemory;19;12288;384;384;0;0;lk_programmemory.dbs;F1;L6
B0;sc_core::sc_module;256;0;<NONE>;M3
P0;pm_address;12;132;lk_programmemory.dbs;T0;F1;L8
P0;pm_instr;20;240;lk_programmemory.dbs;T1;F1;L9
V0;pm_reg;0;352;lk_programmemory.dbs;T1;F1;L11
N0;lk_programmemory;(sc_core::sc_module_name);lk_programmemory.dbs;F1;L24
N0;programmemory;();lk_programmemory.dbs;F1;L14

T6;sc_clock;30;134217728;0;0;0;0;<NONE>

T5;sc_logic;14;134221824;1;12;0;0;<NONE>

M4;sc_main;19;134226048;0;0;0;0;testbench.dbs;F2;L6
S0;clock;2;0;testbench.dbs;T6;F2;L9
S0;reset;2;0;testbench.dbs;T5;F2;L10
S0;count_ctrl;2;0;testbench.dbs;T2;F2;L12
S0;count_data;2;0;testbench.dbs;T0;F2;L13
S0;count_out;2;0;testbench.dbs;T0;F2;L14
C0;counter;1;0;testbench.dbs;M8;F2;L17

M3;sc_module;19;4352;0;0;0;0;<NONE>

T2;sc_uint<2>;17;134222336;2;32;0;0;<NONE>

T1;sc_uint<32>;17;4608;32;32;0;0;<NONE>

T0;sc_uint<8>;17;4608;8;32;0;0;<NONE>

