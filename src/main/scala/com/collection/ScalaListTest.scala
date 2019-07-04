package com.collection

object ScalaListTest {
  def main(args: Array[String]): Unit = {

    //列表定义后是不可变的, 且是一个链表结构、
    //构造列表的两个基本单位是 Nil 和 ::

    val num = (1 :: (2 :: (3 :: Nil)))
    val empty = Nil;
    println("num.head=" + num.head);
    println("num.tail=" + num.tail);
    println("num.isEmpty=" + num.isEmpty);
    println("num.size=" + num.size);
    println("empty.isEmpty=" + empty.isEmpty);

    val emptyList: List[Nothing] = List()
    val stringList: List[String] = List("It", "is", "a", "sunday");
    println("print test:" + stringList);

    val fillList = List.fill(3)("7");
    println("fill test:" + fillList);

    println("List.tabulate() 方法是通过给定的函数来创建列表,起始值为0");
    val tabulateList = List.tabulate(5)(n => n * n);
    println(tabulateList);

    val listA: List[String] = List("It", "is", "a", "sunday!");
    val listB: List[String] = List("this", "is", "testing!");
    var result1 = listA ::: listB;
    println("：：：拼接：" + result1);
    var result2 = List.concat(listA, listB)
    println("List.concat拼接：" + result2)

    var reverse = listA.reverse;
    println("List.reverse :" + reverse);

  }
}
