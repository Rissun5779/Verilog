import scala.io.StdIn
class Loop(var x: Int = 0, var y: Int = 0) {
  def fr(): Unit = {
    println("Calculate result....")
    println("Input you want to get number.")
    x = StdIn.readInt()
    y = StdIn.readInt()

    val results = for {
      i <- 1 to x
      j <- 1 to y
    } yield (i, j, i * j)

    results.foreach { case (i, j, prod) =>
      printf("%2d * %2d = %2d \n", i, j, prod)
    }
  }
}
object start extends App {
  val LP = new Loop()
  LP.fr()
}
