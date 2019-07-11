package com.collection

/**
  * 迭代器
  * 是一种访问方式并不是一个集合
  * 方法：.hasNext()  next()
  */
object ScalaIteratorTest {
  def main(args: Array[String]): Unit = {

    val it = Iterator(1, 2, 3, 4, 5, "end");
    while (it.hasNext) {
      val a = it.next();
      println(a);
    }

    //println("max=" + it.max); //有字符串不能比较
    // 异常：No implicit Ordering definded for Any


    val it2 = Iterator(1, 2, 3, 4, 5);
    println("max=" + it2.max);

    //println("max=" + it2.max);
    //异常： Exception in thread "main" java.lang.UnsupportedOperationException: empty.max


    val it3 = Iterator(1, 2, 3, 4, 5);
    println("min=" + it3.min);

    //使用lengh 和size判断个数
    val it4 = Iterator(1, 2, 3, 4, 5);
    println(it4.size);

    //计数count
    val it5 = Iterator(1, 2, 3, 4, 5);
    println("大于4的个数:" + it5.count(i => i > 4));

    //查找find
    val it6 = Iterator(1, 2, 3, 4, 5);
    val find4 = it6.find(a => a == 4);
    println("find4=" + find4.get);
  }
}
