package main.Strategy

import main.Interface.{IRoute, IStrategyResolver, IStrategy}

/**
  * Created by gokhankaradas on 2/28/16.
  */
class StragetyResolver(list: Map[String, IStrategy]) extends IStrategyResolver {

  override def generateStrategy(key: String): IStrategy = {


    if (list.contains(key)) {
      val result: IStrategy = list(key)

      return result
    }

    null
  }
}
