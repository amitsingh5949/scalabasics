package com.javadwarf.scala.collection

object ListBasics {

  def main(args:Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    val list1 = List[Int](1,2,3,4,5) // type inference is option

    println(list1)
    println(lengthOfList(list)) //5

    // Empty List

    val l2 = List()
    println(l2) //List()

    val l3 = Nil // Nil is singleton class implementing Empty List
    println(Nil.getClass) //List() scala.collection.immutable.Nil$
    println(l3) //List()

    //using cons to initialise list

    val l4 = Nil.::(1) // created empty list with Nil and the added 1 to its head by using cons ::
    println(l4)

    val l5 = Nil.::(1).::(2).::(3)
    println(l5)//List(3, 2, 1) cons add elements to head of list


    val l6 = (1):: (2) :: (3) ::(Nil) //to maintain order
    println(l6) //List(1, 2, 3)

    //to concat two list

    val l7 = l6 ::: l5
    println(l7) //List(1, 2, 3, 3, 2, 1)


    val l8 = l6 :: l5
    println(l8) //List(List(1, 2, 3), 3, 2, 1) we see :: is adding l6 at head of l5 and return a List[Any] noy List[Int] , Any is like Object
    println(l8.getClass)//class scala.collection.immutable.$colon$colon
    println(l8(0).getClass)// scala.collection.immutable.$colon$colon

    //val list are immutable but var lists are mutable
    var l9 = (1):: (2) :: (3) ::(Nil)
    l9 = l9.::(7)
    println(l9)//List(7, 1, 2, 3)

    //concat
    val ll1 = List(1,2)
    val ll2 = List(3,4)
    val ll3 = ll1 ++ ll2
    println(ll3.toArray)

    val a1 = Array(1,2)
    val a2 = Array(3,4)

    println(a1.++(a2).toList)
  }

  def lengthOfList(x : List[Int]) : Int = x.size // defining the type of List is must in parameter argument

}
