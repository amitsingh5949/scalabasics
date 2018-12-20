package com.javadwarf.scala.collection

object RangeBasics {

  def main(args: Array[String]): Unit = {

    // Ranges
    for(x <- 1 to 5) // 5 is included
      print(x+" ")

    println()

    for(x <- 1 until 5) // 5 is excluded
      print(x+" ")


    println()

    for(x <- 1 to 5 by 2) // 5 is excluded
      print(x+" ")

    println()

    for(x <- 'a' to 'z') // 5 is excluded
      print(x+" ")

    println()

    val ll = List("sugar", "milk", "syrup", "flour")

    for(ingredient <- ll ){
      print(ingredient+" ")
    }
    println()
    for(ingredient <- ll if (ingredient=="sugar" )){
      print(ingredient+" ")
    }

    val ingredientFav = for{
      ingredient <- ll
      if (ingredient=="sugar"  || ingredient =="milk")
    }yield ingredient

    println(ingredientFav)

    // convert rages to collection

    println((1 to 5).toList)
    println((1 to 5).toSet)
    println((1 to 5).toArray)
    println((1 to 5).toSeq)

    /*
     List(1, 2, 3, 4, 5)
     Set(5, 1, 2, 3, 4)
     [I@2038ae61
     Range 1 to 5
    */

    var arr = ('a' to 'z' by 2).toList.mkString("")
    print(arr) //acegikmoqsuwy

    println()

    var arr1 = ('a' to 'z' by 2).toList
    arr1.foreach(print(_))//acegikmoqsuwy : _ is wild card character

  }

}
