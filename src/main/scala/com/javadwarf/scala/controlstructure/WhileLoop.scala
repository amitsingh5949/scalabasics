package com.javadwarf.scala.controlstructure

import com.javadwarf.scala.controlstructure.WhileLoop.x

object WhileLoop extends App{

  var x : Int = 1
  var y : Int = 1

  while(x <= 5){
    y = 1
    while( y <= 10){
      if( (x*y).toString().contains('4') || (x*y).toString().contains('6') )
         println(s"${x} times ${y} is ${x * y}")
      y = y + 1
    }
    x = x + 1
  }

}
