package com.thrownforaloop.code

object Util {
  private val defaultAlphabit = Seq(
    'a','b','c','d','e'
  )

  def generate(number:Int, alphabit:Seq[Char] = defaultAlphabit) = (0 to number).map(_ => defaultAlphabit.toString)
}