transcript on
if {[file exists rtl_work]} {
	vdel -lib rtl_work -all
}
vlib rtl_work
vmap work rtl_work

vlog -vlog01compat -work work +incdir+/home/rissun57/Desktop/Verilog/Verilog/Verilog/class-1 {/home/rissun57/Desktop/Verilog/Verilog/Verilog/class-1/DECODER2_4.v}

vlog -vlog01compat -work work +incdir+/home/rissun57/Desktop/Verilog/Verilog/Verilog/class-1 {/home/rissun57/Desktop/Verilog/Verilog/Verilog/class-1/DECODER2_4_Test.v}

vsim -t 1ps -L altera_ver -L lpm_ver -L sgate_ver -L altera_mf_ver -L altera_lnsim_ver -L cyclonev_ver -L cyclonev_hssi_ver -L cyclonev_pcie_hip_ver -L rtl_work -L work -voptargs="+acc"  DECODER2_4_Test

add wave *
view structure
view signals
run -all
