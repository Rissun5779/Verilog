import scala.io.StdIn
class branch(var x: Int = 0) {
  def scan(): Unit = {
    println("Input Number to Stdin.")
    x = StdIn.readInt()
    printf("Your input number is: %2d\n", x)
  }
  def Branch(): String = {
    if (x == 0) {
      "Zero"
    } else if (x > 0) {
      "Positive"
    } else {
      "Negative"
    }
  }
}

object start extends App {
  val B = new branch()
  B.scan()
  println(B.Branch())
}
