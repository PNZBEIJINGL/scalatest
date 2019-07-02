package com.test

import java.util.Date


object ScalaMethod_Currying {

  var factor = 3;
  var mul = (i: Int) => i * factor;

  def main(args: Array[String]): Unit = {
    //不提供所有参数
    val date = new Date;
    val loginfo = printlog(date, _: String);
    loginfo("This is testing 1");
    Thread.sleep(1000);
    loginfo("This is testing 2");

    //柯里化(Currying)指的是将原来接受两个参数的函数变成新的接受一个参数的函数的过程
    // 新的函数返回一个以原有第二个参数为参数的函数
    val str1: String = "Test";
    val str2: String = "Me";
    println("str1+str2=" + addStr(str1)(str2));

    //闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
    println("闭包测试："+mul(5));

  }

  def addStr(str1: String)(str2: String) = {
    str1 + str2;
  }

  def printlog(date: Date, message: String): Unit = {
    println(date + " : " + message)
  }
}
