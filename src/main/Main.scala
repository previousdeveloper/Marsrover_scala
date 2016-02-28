package main

import main.Route.RouteFactoryResolver
import main.Validator.GridValidator

/**
  * Created by gokhankaradas on 2/28/16.
  */
object Main {

  def main(args: Array[String]): Unit = {


    val validator: GridValidator = new GridValidator()

    val grid = new Grid(5, 5, validator)

    val routeFactory = new RouteFactoryResolver(grid)

    val rover = new Rover(grid, "E", routeFactory)

    rover.executeStrategy("MMRMMRMRRM")

   Console.println( grid.toString)
  }

}
