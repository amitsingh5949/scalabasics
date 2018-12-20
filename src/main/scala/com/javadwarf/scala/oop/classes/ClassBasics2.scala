package com.javadwarf.scala.oop.classes


class ClassBasics2(msg : String, val x : String, var y : String){

  println("Is it constructor?")
  println("I guess so " + msg)

  def printMsg() = println(msg)

}


/*
class DemoWithParams(name: String) {
println(s"Constructing for $name")
}
// rest of class...
Parameters on the class definition become primary constructor parameters

Code in the class (not in defs) becomes the primary constructor code, runs when a new instance is constructed

Can't access the constructor parameters from outside (private)
val demo = new DemoWithParams("Jill")
demo.name
// Error:(33, 83) value name is not a member of DemoWithParams

To make them accessible outside, we need to make them public and to make them public we can declare them val
A val is field and parameters in constructor are called parametric fields if declared val like below



class DemoWithParams(val name: String) {


 */