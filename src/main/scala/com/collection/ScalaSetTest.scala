package com.collection

object ScalaSetTest {
  def main(args: Array[String]): Unit = {

    //set集合,集合中的元素唯一
    //scala.collection.immutable.Set  不可变集合
    //scala.collection.mutable.Set  可变集合
    val set = Set(0, 1, 2, 3, 4, 5, 6, 7)
    println(set.getClass.getName)
    println(set.exists(_ % 2 == 0))
    println(set.drop(1))

    //空集合
    val num: Set[Int] = Set();
    println("set.head=" + set.head);
    println("set.tail=" + set.tail);
    println("set.empty=" + set.isEmpty);
    println("空set=" + num.isEmpty);

    //set.++ 拼接集合
    val set2 = Set("This", "is", "a", "test ");
    val set3 = Set("end");
    var set=set ++ set2 ++ set3;
    println("++拼接: " + set ++ set2 ++ set3);


  }
}
