package main.Strategy

import main.Interface.IStrategy
import main.Route.{East, West, North, South}

/**
  * Created by gokhankaradas on 2/28/16.
  */
class StrategyTypes {


  def list(): Map[String, IStrategy] = {

    val list = Map(
      "M" -> new MoveForwardStrategy()
      , "L" -> new LeftStragety()
      , "R" -> new RightStrategy()
    )

    list
  }
}
