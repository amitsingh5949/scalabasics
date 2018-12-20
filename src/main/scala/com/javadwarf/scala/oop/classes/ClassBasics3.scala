package com.javadwarf.scala.oop.classes

class ClassBasics3(val n : Int, val d : Int){

  require(d!=0, "denominator cannot be zero") // require is like assert statements in java

  override def toString: String = s"R($n/$d)" // if we do not put override, Method 'toString' needs override modifier

  def compare(obj : ClassBasics3) : ClassBasics3 = if( this.n.toDouble/this.d > obj.n.toDouble/obj.d) this else obj

  def +(obj : ClassBasics3) : ClassBasics3 = { // creating a function with operator as name, scala does not have operator overloading but it has symbolic names
    new ClassBasics3( this.n*obj.d + this.d*obj.n, this.d*obj.d )
  }

}

