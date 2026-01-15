#!/usr/bin/env amm

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
