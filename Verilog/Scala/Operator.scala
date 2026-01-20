class Operator(val name: String, var Score: Int) {
  def exam(s: Int): Unit = {
    Score = s;
  }
  def friends(n: String, s: Int): Unit = {
    println("My friend " + n + " gets " + s + ".")
  }
  override def toString(): String = {
    name + "'s score is " + Score + "."
  }
}
object start extends App {
  val Op = new Operator("Alice", 33)
  Op.exam(100)
  println(Op)
  Op.friends("Bob", 81)
}
