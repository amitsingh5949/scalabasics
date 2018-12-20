package com.javadwarf.scala.collection

object ArrayBasics {

  def main(args:Array[String]): Unit = {

    val arr : Array[String] = new Array[String](3);
    println(arr)//[Ljava.lang.String;@2c8d66b2 created arr with 3 nulls

    //Array is mutable ds while list is not
    val a = Array("acb", "acdd", "ddd")
    // calls a implicit function in Array singleton class called apply()

    val b = Array.apply("acb", "acdd", "ddd")

    println(a(0)) // apply() is called here also //acb
    println(a.apply(0))//acb

    b(0) = "sdf" // calls update()
    b.update(1, "dffg")

    println(b(0))//sdf
    println(b(1))//dffg

    //re write happens if class has apply and update method, list does not have update method so calling update() is not possible


  }

}
