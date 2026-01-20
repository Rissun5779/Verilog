error id: file:///C:/Users/USER/Desktop/Verilog/Verilog/Scala/if.scala:scala/Int#
file:///C:/Users/USER/Desktop/Verilog/Verilog/Scala/if.scala
empty definition using pc, found symbol in pc: scala/Int#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Int#
	 -scala/Predef.Int#
offset: 49
uri: file:///C:/Users/USER/Desktop/Verilog/Verilog/Scala/if.scala
text:
```scala
class branch {
  x: Int

  def WhichInt(x: Int@@) = {
    if (x == 0) {
      "Zero"
    } else if (x > 0) {
      "Positive"
    } else {
      "Negative"
    }
  }
}

object start extends app {}

```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Int#