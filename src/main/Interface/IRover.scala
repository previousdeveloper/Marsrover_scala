package main.Interface

/**
  * Created by gokhankaradas on 2/28/16.
  */
trait IRover {

  def turnLeft(): Unit

  def turnRight(): Unit

  def move(): Unit

  def executeStrategy(routeList: String): Unit
}

