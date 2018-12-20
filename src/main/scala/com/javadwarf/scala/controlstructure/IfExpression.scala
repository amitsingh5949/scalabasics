package com.javadwarf.scala.controlstructure

import com.javadwarf.scala.collection.StringInterpolation.e

object IfExpression {

  def main(args : Array[String]) : Unit = {

    val x = 10

    val y = if( x == 10) x else 0

    println(y)

    val z = if( x > 5) {
      val temp =  x + 12
      temp * temp
    }
    else {
      val temp =  x + 13
      temp * temp
    }

    println(z)

    // try can also be used as expressions

    val w = try{
      x/0
    }
    catch{
      case e : ArithmeticException => 0
    }
    finally{
      println("This run always")
      1 // this one is never assigned to w
    }

    println(w)

    val e = 110;
    var temp = if(e>100) e else 100 // similar to ternary operator
    println(temp)

  }





}
