package com.collection

/**
  * Scala元组
  * 和列表一样,最大长度是22
  * 不可变的可以存储不同类型
  */
object ScalaTest {
  def main(args: Array[String]): Unit = {
    val t = (1, 3.1415926, "r");
    println(t);

    val sum=t._1+t._2;
    println("使用数字索引访问元素 t._1 方式访问 sum="+sum)

    //迭代访问
    t.productIterator.foreach(i=>println(i));

    //2表示2个元素,Tuple3 =3个元素
    val t1 = new Tuple2("www.google.com","www.baidu.com")
    println(t1.swap)

  }
}
