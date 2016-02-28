package main.Strategy

import main.Interface.{IRoute, IGrid}
import main.Route.{East, West, North, South}

/**
  * Created by gokhankaradas on 2/28/16.
  */
class RouteStrategyTypes(grid: IGrid) {


  def list(): Map[String, IRoute] = {

    val list = Map(
      "S" -> new South(grid)
      , "N" -> new North(grid)
      , "W" -> new West(grid)
      , "E" -> new East(grid)
    )

    list
  }
}
