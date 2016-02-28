package main

import main.Interface.IGrid
import main.Validator.IGridValidator

/**
  * Created by gokhankaradas on 2/28/16.
  */
class Grid(gridX: Int, gridY: Int, gridValidator: IGridValidator) extends IGrid {


  override def goToEast(): Unit = {
    val validate = gridValidator.validate(X, gridX)
    if (validate) {
      X = X + 1
    }
  }

  override def goToNorth(): Unit = {
    val validate = gridValidator.validate(Y, gridY)

    if (validate) {
      Y = Y + 1
    }
  }

  override def goToSouth(): Unit = {
    val validate = gridValidator.validate(Y)

    if (validate) {
      Y = Y - 1
    }
  }

  override def goToWest(): Unit = {
    val validate = gridValidator.validate(X)

    if (validate) {
      X = X - 1
    }
  }

  override var Y: Int = 3
  override var X: Int = 3

  override def toString: String = {

    s"X: $X, Y:$Y"
  }
}
