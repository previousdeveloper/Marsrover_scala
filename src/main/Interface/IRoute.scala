package main.Interface

/**
  * Created by gokhankaradas on 2/28/16.
  */
trait IRoute {

  def turnLeft(): IRoute

  def turnRight(): IRoute

  def move(): Unit
}
