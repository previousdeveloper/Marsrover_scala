package main.Validator

/**
  * Created by gokhankaradas on 2/28/16.
  */
trait IGridValidator {

  def validate(value: Int): Boolean

  def validate(value: Int, gridSize: Int): Boolean
}


class GridValidator extends IGridValidator {

  override def validate(value: Int): Boolean = {
    value > 0
  }

  override def validate(value: Int, gridSize: Int): Boolean = {
    val result = value < gridSize

    result
  }
}