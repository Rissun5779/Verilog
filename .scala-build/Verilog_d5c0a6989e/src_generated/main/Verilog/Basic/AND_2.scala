package Verilog.Basic


final class AND_2$_ {
def args = AND_2_sc.args$
def scriptPath = """Verilog/Basic/AND_2.sc"""
/*<script>*/


// 1. 引入 Chisel 6.0 主程式
import $ivy.`org.chipsalliance::chisel:6.0.0`

// 2. 【關鍵魔法】強制引入 "舊版 Scala" 的插件
// 我們手動指定 artifact 名稱 (chisel-plugin_2.13.12)，騙過 Ammonite 的版本檢查
import $plugin.$ivy.`org.chipsalliance:chisel-plugin_2.13.12:6.0.0`

import chisel3._
import _root_.circt.stage.ChiselStage
import scala.language.reflectiveCalls

class AND_2 extends Module {
  val io = IO(new Bundle {
    val A = Input(Bool())
    val B = Input(Bool())
    val Y = Output(Bool())
  })
  io.Y := io.A & io.B
}

println("==========================================")
println("正在嘗試強制載入插件並生成電路...")
println("==========================================")

try {
  val verilog = ChiselStage.emitSystemVerilog(new AND_2)
  println(verilog)
  println("==========================================")
  println("🎉 恭喜！終於成功突破版本封鎖了！")
} catch {
  case e: Throwable =>
    println("失敗: " + e.getMessage)
    println("如果還是失敗，建議改用 SBT 工具，不要用 Ammonite 腳本了。")
}

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

