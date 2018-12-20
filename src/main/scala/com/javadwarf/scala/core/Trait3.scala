package com.javadwarf.scala.core

import com.typesafe.scalalogging.LazyLogging

object Trait3 extends App with LazyLogging {

  logger.info("System arguments are :")
  logger.info(args.mkString(","))
}
