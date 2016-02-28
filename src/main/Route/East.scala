package main.Route

import main.Interface.{IRoute, IGrid}

/**
  * Created by gokhankaradas on 2/28/16.
  */
class East(grid: IGrid) extends IRoute {

  override def turnLeft: IRoute = {

    return new North(grid)
  }

  override def move: Unit = {

    grid.goToEast()
  }

  override def turnRight: IRoute = {
    return new South(grid)
  }

  override def toString: String = {
    return "East";
  }


}
