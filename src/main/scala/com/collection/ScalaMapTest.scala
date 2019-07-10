package com.collection

import scala.collection.mutable.Map

object ScalaMapTest {
  def main(args: Array[String]): Unit = {
    val names = Map(1 -> "liuy", 2 -> "zhang", 3 -> "chang");
    var age: Map[Int, Int] = Map();
    println(names.keys);
    println(names.values);
    println(names.isEmpty);
    println(age.isEmpty);
    println(names.get(2));
    println(names.last);
    println(names.min);
    println(names.max);
    println(names.size)
    println()

    println("contains" + names.contains(1));
    println("contains" + names.contains(2019));

    //遍历
    names.keys.foreach(i => println(names(i)));

    //Map 合并
    var map1 = Map(1 -> "2017", 2 -> "2018", 3 -> "2019");
    var map2 = Map(3 -> "2016", 4 -> "2020", 2 -> "2018");
    var mapadd = map1 ++ map2;
    println("add map ++:" + mapadd);
    var mapadd2 = map1.++(map2);
    println("add map .++():" + mapadd2);

    mapadd2.clear();
    println("after mapadd2.clear()"+mapadd2);
  }
}
