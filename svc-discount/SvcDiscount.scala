package com.thrownforaloop.discount
import com.twitter.algebird.Semigroup
import com.thrownforaloop.code.Util

object SvcDiscount{
  def main(args: Array[String]) = {
    val codes = Util.generate(5)
    val message = Semigroup.plus("generated ", codes.toString)
    println(message)
  }
}