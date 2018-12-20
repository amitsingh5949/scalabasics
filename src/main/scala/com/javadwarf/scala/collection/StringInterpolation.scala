package com.javadwarf.scala.collection

object StringInterpolation extends App {

  val friut : String = "mango"
  println(s"My favourite fruit is ${friut}")

  case class  Employee(val id: Double, val name:String ) // case classes like pojos

  val e : Employee = new Employee(101.0, "Amit")
  println(s"Emp id is ${e.id}")

  println(s"is emp id 101? : ${e.id==102.0}")

  println(f"My favourite fruit is $friut%20s ")

 // println(f"emp id is : $e.id%.2f" )



}
