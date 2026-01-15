import chisel3._

class AND_2 extends Module{
    val io = IO(new Bundle{}
        val A = Input(Bool())
        val B = Input(Bool())
        val Y = Output(Bool())
    })

    io.Y := io.A & io.B
}

object AND_2 extensds App{
    (new chisel3.stage.ChiselStage).emitVerilog(new AND_2)
}