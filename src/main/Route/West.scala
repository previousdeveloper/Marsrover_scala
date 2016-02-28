package main.Route

import main.Interface.{IRoute, IGrid}

/**
  * Created by gokhankaradas on 2/28/16.
  */
class West(grid: IGrid) extends IRoute {

  val WEST_KEY ="West";

  override def turnLeft: IRoute = {
    return new South(grid)
  }

  override def move: Unit = {
    grid.goToWest()
  }

  override def turnRight: IRoute = {
    return new North(grid)
  }

  override def toString: String = {

    return WEST_KEY
  }
}
