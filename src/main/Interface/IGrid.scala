package main.Interface

/**
  * Created by gokhankaradas on 2/28/16.
  */
trait IGrid {

  def goToEast(): Unit

  def goToWest(): Unit

  def goToNorth(): Unit

  def goToSouth(): Unit

  var X: Int
  var Y: Int

}
