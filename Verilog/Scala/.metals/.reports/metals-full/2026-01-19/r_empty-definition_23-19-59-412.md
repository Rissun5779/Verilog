error id: file:///C:/Users/USER/Desktop/Verilog/Verilog/Scala/Student.scala:
file:///C:/Users/USER/Desktop/Verilog/Verilog/Scala/Student.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -register.
	 -register#
	 -register().
	 -scala/Predef.register.
	 -scala/Predef.register#
	 -scala/Predef.register().
offset: 172
uri: file:///C:/Users/USER/Desktop/Verilog/Verilog/Scala/Student.scala
text:
```scala
class Student {
  var name = "None"
  def register(n: String): Unit = {
    name = n
  }
}

val stu = new Student
stu.name = "Alice"
println(stu.name)

stu.regis@@ter("Bob")

```


#### Short summary: 

empty definition using pc, found symbol in pc: 