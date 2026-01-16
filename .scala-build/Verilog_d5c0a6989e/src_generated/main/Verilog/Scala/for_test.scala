package Verilog.Scala


final class for_test$_ {
def args = for_test_sc.args$
def scriptPath = """Verilog/Scala/for_test.sc"""
/*<script>*/
object ForTest {
  def main(args: Array[String]): Unit = {
    var a = 0;
    for (a <- 1 until 6) {
      println("value of a:" + a);
    }
  }
}

/*</script>*/ /*<generated>*//*</generated>*/
}

object for_test_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new for_test$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    script.ForTest.main(args) // hashCode to clear scalac warning about pure expression in statement position
  }
}

export for_test_sc.script as `for_test`

