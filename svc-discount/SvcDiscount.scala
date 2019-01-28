package com.thrownforaloop.discount
import com.thrownforaloop.code.Util

object SvcDiscount{
  def main(args: Array[String]) = {
    val codes = Util.generate(5)
    println( s"generated: ${codes}")
  }
}