package com.javadwarf.scala.core


// object is singleton object of class, entry point would always be main method defined in object
// using trait also serve as entry point, traits are like interfaces , App is a trait that can be extended to achieve the same effect
// Any free floating code inside trait act as if it was in main method

object HelloWorld {

  def main(args: Array[String]) {
    print("Hello World");
  }

}

/*
Statements, side-effects, vars, and mutability are not functional programming style Instead, aim for expressions, vals and immutability whenever possible

Use vars or mutability when dictated by performance or other factors

You don't need a var with a mutable collection, instead choose one or the other

Don't let mutability escape into the API

Don't optimize for performance prematurely

Also keep methods short and uncomplicated, separate early and often
 */