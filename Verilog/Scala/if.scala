class branch(var x: Int) {
  def WhichInt(x: Int): String = {
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
  val B = new branch(33)
  println(B.WhichInt(B.x))
}
