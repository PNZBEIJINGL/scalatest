package com.test

import java.util.{HashMap => JavaHashMap};

/**
  * 数据类型
  */
object ScalaDataTest {

  //基本语法
  //区分大小写 -  Scala是大小写敏感的，这意味着标识Hello 和 hello在Scala中会有不同的含义
  //类名 - 对于所有的类名的第一个字母要大写  class MyFirstScalaClass
  //方法名称 - 所有的方法名称的第一个字母用小写 如果若干单词被用于构成方法的名称，则每个单词的第一个字母应大写 def myMethodName()
  // 程序文件名 - 程序文件的名称应该与对象名称完全匹配(新版本不需要了，但建议保留这种习惯)。

  def main(args: Array[String]) {
    println("Hello World");
    //换行
    println("Hello,\nWorld");
    //水平制表下一个TAB位置
    println("Hello,\tWorld");

    //Scala是面向行的语言，语句可以用分号（;）结束或换行符
    val s = "这是一个换行测试";
    println(s)

    //多行字符串用三个双引号来表示分隔符，格式为：""" ... """
    val n=
      """
        这是
        一个
        多行
        字符
        测试
      """;
    println(n);

  }
}
