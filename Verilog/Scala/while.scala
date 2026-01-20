import scala.io.StdIn
class Loop(var x: Int = 0, var Sum: Int = 1) {
  def wh(): Unit = {
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
