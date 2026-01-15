file:///C:/Users/USER/Desktop/Verilog/Verilog/Basic/AND_2.scala
empty definition using pc, found symbol in pc: 
semanticdb not found
empty definition using fallback
non-local guesses:

offset: 255
uri: file:///C:/Users/USER/Desktop/Verilog/Verilog/Basic/AND_2.scala
text:
```scala
import chisel3._

class AND_2 extends Module{
    val io = IO(new Bundle{}
        val A = Input(Bool())
        val B = Input(Bool())
        val Y = Output(Bool())
    })

    io.Y := io.A & io.B
}

object AND_2 extends App{
    (new chisel@@3.stage.ChiselStage).emitVerilog(new AND_2)
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 