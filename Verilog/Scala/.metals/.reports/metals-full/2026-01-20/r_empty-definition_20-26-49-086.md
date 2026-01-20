error id: file:///C:/Users/USER/Desktop/Verilog/Verilog/Scala/For.scala:scala/Unit#
file:///C:/Users/USER/Desktop/Verilog/Verilog/Scala/For.scala
empty definition using pc, found symbol in pc: scala/Unit#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Unit#
	 -scala/Predef.Unit#
offset: 83
uri: file:///C:/Users/USER/Desktop/Verilog/Verilog/Scala/For.scala
text:
```scala
import scala.io.StdIn
class Loop(var x: Int = 0, var Sum: Int = 1) {
  def fr(): @@Unit = {
    println("Calculate factorial....")
    println("Input you want to get number.")
    x = StdIn.readInt()

    while (x != 0) {
      Sum = Sum * x
      x = x - 1
    }
    printf("Sum is %2d\n", Sum)
  }
}
object start extends App {
  val LP = new Loop()
  LP.wh()
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Unit#