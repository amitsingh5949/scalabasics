package com.javadwarf.scala.collection

object SequenceBasics {

  def main(args:Array[String]): Unit = {
    // list and array both are subtypes of Sequence

    val s1:Seq[Int] = Seq(1,2,3)
    val s2:Seq[Int] = Seq[Int](1,2,3)

    val s3:Seq[Int] = List[Int](1,2,3)

    val s4:Seq[Int] = Array[Int](1,2,3)

    val s5:Seq[Int] = Vector[Int](1,2,3)

  }


}
