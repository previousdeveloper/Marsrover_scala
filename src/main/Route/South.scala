package main.Route

import main.Interface.{IRoute, IGrid}

/**
  * Created by gokhankaradas on 2/28/16.
  */
class South(grid: IGrid) extends IRoute {

  override def turnLeft(): IRoute = {
    new East(grid)
  }

  override def move(): Unit = {

    grid.goToSouth()
  }

  override def turnRight(): IRoute = {

    new West(grid)
  }

  override def toString: String = {
    "South"
  }
}
