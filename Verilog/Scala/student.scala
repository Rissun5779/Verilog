class student {
  var name = "None"
  def register(n: String): Unit = {
    name = n
  }
}

object Start extends App {
  val stu = new student
  stu.name = "Alice"
  println(stu.name)

  stu.register("Bob")
  println(stu.name)
}
