package com.javadwarf.scala.core

object variables {

  def main(args: Array[String]): Unit = {

    var radius : Double = 10.0; // var is used define mutable variables, defining type is optional
    val PI : Double = 3.14; // val is used to define immutable variables, same as final in java

    println("PI is : " + PI)


    radius = 12.0
    println("radius is : " + radius)

    //PI = 3.12; reassignment to val error
    //radius = "hi" Error:(17, 14) type mismatch;  found   : String("hi") required: Double radius = "hi"

    val donutsBought: Int = 5
    val bigNumberOfDonuts: Long = 100000000L
    val smallNumberOfDonuts: Short = 1
    val priceOfDonut: Double = 2.50
    val donutPrice: Float = 2.50f
    val donutStoreName: String = "all about scala Donut Store"
    val donutByte: Byte = 0
    val donutFirstLetter: Char = 'D'
    val nothing: Unit = ()

    //hide scope

    val x  = 10
    println("x is : " + x)
    /*{
      val x = 12
      println("x is :" + x)
    }*/
    println("x is : " + x)

  }

}

/*
type inference can be omitted for variable type and return type of method
 */