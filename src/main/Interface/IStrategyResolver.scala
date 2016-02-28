package main.Interface

/**
  * Created by gokhankaradas on 2/28/16.
  */
trait IStrategyResolver {

  def generateStrategy(key: String): IStrategy
}
