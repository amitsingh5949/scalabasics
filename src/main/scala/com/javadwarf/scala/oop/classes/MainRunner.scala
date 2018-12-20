package com.javadwarf.scala.oop.classes

object MainRunner {

  def main(args: Array[String]): Unit = {

    val class1: ClassBasics1 = new ClassBasics1
    //println(class1.sum())
   // println(class1.sum(2,3))


    val class2: ClassBasics2 = new ClassBasics2("hello","! ","world")
    class2.printMsg()
    println(class2.x) // public field x and y
    println(class2.y)
    //println(class2.msg) mot accessible field msg as it is private

    /*
    Is it constructor?
    I guess so hello
    hello
    !
    world
     */

    val class3: ClassBasics3 = new ClassBasics3(10,35)
    println(class3) //R(10/35)

    //val class4: ClassBasics3 = new ClassBasics3(10,0) //Exception in thread "main" java.lang.IllegalArgumentException: requirement failed: denominator cannot be zero

    val class30: ClassBasics3 = new ClassBasics3(10,17)
    println(class3.compare(class30)) //R(10/17)
    println(class3 compare class30) //R(10/17) // infix notation
    println(class3.+(class30))//R(520/595)
    println(class3 + class30)//R(520/595) // infix notation
  }

}
