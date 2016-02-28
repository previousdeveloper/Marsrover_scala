package main.Route

import main.Interface.{IRoute, IGrid}

/**
  * Created by gokhankaradas on 2/28/16.
  */
class North(grid: IGrid) extends IRoute {

  override def turnLeft: IRoute = {
    return new West(grid)
  }

  override def move: Unit = {
    grid.goToNorth()
  }

  override def turnRight: IRoute = {

    return new East(grid)
  }

  override def toString: String = {
    return "North"
  }
}
