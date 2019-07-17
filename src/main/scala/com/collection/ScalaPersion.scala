package com.collection

class ScalaPersion(name: String) {
  val hi ="hi";
  def print(): Unit = {
    println(hi+" name is " + name);
  }

}

/**
  * Scala 使用 extends 关键字来继承一个类
  * @param name
  */
class FootballPlayer(name: String) extends ScalaPersion(name: String){
  override val hi ="hello";
  def sayhi(): Unit = {
    println("I am football player ");
  }
}