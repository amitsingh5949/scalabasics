package com.javadwarf.scala.collection

import scala.collection._


object SetBasics {

  def main(args:Array[String]): Unit = {

    val set1:Set[Int] = Set(2,3,4,1,2,3,4,5,6)

    println(set1)//Set(5, 1, 6, 2, 3, 4) no order, no duplicates

    val set2= mutable.TreeSet(2,3,4,1,2,3,4,5,6)
    println(set2) //TreeSet(1, 2, 3, 4, 5, 6),


    // we have immutable and mutable sets both
    val set3 = mutable.Set(2,3,4,1,2,3,4,5,6)
    set3 -= 2
    set3 += 19
    println(set3)//Set(1, 5, 6, 3, 4, 19)

    val set4 = immutable.Set(2,3,4,1,2,3,4,5,6)
   // set4 -= 2 Expression does not convert to assignment because receiver is not assignable.//set4 = set4 - 2

    var set5 = immutable.Set(2,3,4,1,2,3,4,5,6) // bad practice
    set5.-=(2) //immutable set works as mutable if you assign it to var
    println(set5)// Set(5, 1, 6, 3, 4)

  }

}
