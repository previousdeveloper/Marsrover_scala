package main.Interface

/**
  * Created by gokhankaradas on 2/28/16.
  */
trait IRouteFactoryResolver {

  def generateRoute(routeName: String): IRoute
}
