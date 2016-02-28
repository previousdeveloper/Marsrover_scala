package main.Route

import java.util

import main.Interface.{IGrid, IRoute, IRouteFactoryResolver}
import main.Strategy.RouteStrategyTypes

/**
  * Created by gokhankaradas on 2/28/16.
  */
class RouteFactoryResolver(grid: IGrid) extends IRouteFactoryResolver {

  override def generateRoute(routeName: String): IRoute = {


    val routeStrategyTypes = new RouteStrategyTypes(grid)

    val routeFactoryImpl = new RouteFactory(routeStrategyTypes.list())

    val route = routeFactoryImpl.generateRoute(routeName)

    if (routeName == null) {
      //
    }

    route
  }
}
