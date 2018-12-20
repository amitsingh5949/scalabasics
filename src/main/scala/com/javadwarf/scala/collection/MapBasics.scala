package com.javadwarf.scala.collection

object MapBasics {

  def main(args:Array[String]): Unit = {
    // Expression Method -> , you can call this methos on any instance and asigne new intance with it and it returns a tuple, calling -> wraps the object in ArrowAssoc

   val x =  "hi".->(88) // -> is a method in String class, if you create a sting and type. and cttr+space , you will see buch of operator looking methods
    println(x) //(hi,88)  // above code creates a tuple

    val x1 = "hello" -> (90) // using re wrting rule we can drop the .
    println(x1) //(hello,90)

    var xm: Map[Int, String] = Map[Int, String](1->"abc", 2->"xyz", 3->"pqr")

    println(xm)//Map(1 -> abc, 2 -> xyz, 3 -> pqr)
    println(xm(1))//abc

    // iterating over map using for <- is keyword using with for construct
    for((key,value) <- xm){
      println( s"key is ${key} and value is ${value}")
    }

    val mutMap = scala.collection.mutable.Map[Int, String]()

    mutMap += (1 -> "Uno")
    mutMap += (2 -> "Dos")
    mutMap += (3 -> "Tres")

    println(mutMap(2))// should be ("Dos")

    mutMap(2) = "Two"

    println(mutMap(2))// should be ("Two")

    mutMap += (2 -> "Deux")

   println( mutMap(2) )// should be ("Deux")

  }

}
