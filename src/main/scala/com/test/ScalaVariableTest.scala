package com.test

class ScalaVariableTest {

  //在 Scala 中，使用关键词 "var" 声明变量，使用关键词 "val" 声明常量。
  var fooVar: String = "foo";
  val titalVal: String = "Test";

  //没有指明数据类型的情况下声明变量或常量必须要给出其初始值，否则将会报错
  var ageVar = 10;
  var msgVar = "This is a message";

  def main(args: Array[String]): Unit = {

  }
}
