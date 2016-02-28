package main.Strategy

import main.Interface.{IRover, IStrategy}

/**
  * Created by gokhankaradas on 2/28/16.
  */
class RightStrategy extends IStrategy{

  override def execute(rover: IRover): Unit = {
    rover.turnRight()
  }
}
