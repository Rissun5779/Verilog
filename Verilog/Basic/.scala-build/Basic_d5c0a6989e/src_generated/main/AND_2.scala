

final class AND_2$_ {
def args = AND_2_sc.args$
def scriptPath = """AND_2.sc"""
/*<script>*/

import $ivy.`edu.berkeley.cs::chisel3:3.6.0`

/*</script>*/ /*<generated>*//*</generated>*/
}

object AND_2_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new AND_2$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export AND_2_sc.script as `AND_2`

