package main

import main.Interface._
import main.Strategy.{StragetyResolver, StrategyTypes}

/**
  * Created by gokhankaradas on 2/28/16.
  */
class Rover(grid: IGrid, routeName: String, routeFactoryResolver: IRouteFactoryResolver) extends IRover {

  var Route: IRoute = routeFactoryResolver.generateRoute(routeName)

  override def turnLeft(): Unit = {
    Route.turnLeft()
  }

  override def move(): Unit = {
    Route.move()
  }

  override def executeStrategy(routeList: String): Unit = {

    val strategyList: Map[String, IStrategy] = new StrategyTypes().list()
    val resolver: StragetyResolver = new StragetyResolver(strategyList)

    for (item <- routeList) {

      val strategy: IStrategy = resolver.generateStrategy(item.toString)

      strategy.execute(this)
    }

  }

  override def turnRight(): Unit = {
    Route.turnRight()
  }

  override def toString: String = {
    grid.X.toString + grid.Y.toString
  }
}
