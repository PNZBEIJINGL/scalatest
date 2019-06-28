package com.test

object ScalaMethodTest_Callname {
  def main(args: Array[String]): Unit = {
        //方法调用
       delayed(time());
  }

  def time() = {
    println("do time");
    System.nanoTime();
  }

  def delayed(t: Long) = {
    println("in delayed ")
    println("参数:" + t);
    t;
  }
}
