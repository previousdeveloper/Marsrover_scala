package main.Route

import main.Interface.{IRouteFactoryResolver, IRoute}


/**
  * Created by gokhankaradas on 2/28/16.
  */
class RouteFactory(_strategies: Map[String, IRoute]) extends IRouteFactoryResolver {

  override def generateRoute(routeName: String): IRoute = {

    if (_strategies.contains(routeName)) {
      val result: IRoute = _strategies(routeName)

      return result
    }

    return null
  }
}
