package com.javadwarf.scala.collection

object Tuples {

  def main(args:Array[String]): Unit = {

    val res = (1, 2, 'x', "hi")

    println(res._1) // index starts with 1
    println(res._4)

    val (a,b,c,d) = res //assigning  tuple contents to variables

    println(c)

    val (a1:Int, b1:Int, c1:Char, d1:String) = res // can define types as well

    print(c1)
  }

}
