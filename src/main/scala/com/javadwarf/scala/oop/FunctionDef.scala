package com.javadwarf.scala.oop

object FunctionDef {

  def main(args : Array[String])  {
      print("hi")
    println(add(1,2))
    println(add1(1,2))
    println(add3(1,2))
    say() //without parameter
  }

  //if you specify the return type of function in signature the  you must use =
  def add(x : Int, y : Int) : Int = { x + y } // o/p 3

  def add1(x : Int, y : Int)  { x + y} // o/p () empty tuple or instance of unit is returned as return type not given nothing is returned from Unit function

  //def add2(x : Int, y :Int) : Int  { x + y } // need to use = since used return type of function

  def add3(x : Int, y : Int) = x + y // o/p - 3 single line expression no need to for {}

  def say() = print("without parameter")// method or statement having unit as return type must have some side effect like i/o i.e. print() or modifies a mutable data structure or variable

  if( 1 > 2) 1 else 2 // this is statement and it has no side effect, so its not useful as value 1 or 2 is abandoned

  //in scala expressions are preferred over statements

  // if, try, for can be used as expressions but while or do while always returns Unit so make no sense to use as expression
}
