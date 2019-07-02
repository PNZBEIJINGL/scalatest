package com.test

import java.util.Date

object ScalaMethodTest {

  def main(args: Array[String]): Unit = {
    var result = addInt(4, 6);
    println("addInt=" + result);

    var number = ScalaOperatorTest.addInt(4, 3);
    println("ScalaOperatorTest.addInt=" + number);

    pringString("cat", "dog");

  }

  //方法定义
  def addInt(a: Int, b: Int): Int = {
    var sumVar = 0;
    sumVar = a + b;
    return sumVar;
  }

  //允许最后1个参数是重复的，增加一个*
  def pringString(names: String*) = {
    var i: Int = 0;
    for (name <- names) {
      println(name);
    }
  }

}
