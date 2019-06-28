package com.test

object ScalaLoopTest {
  def main(args: Array[String]): Unit = {

    var a = 0;
    //左箭头 <- 用于为变量 x 赋值。
    // 使用to 时，包含10
    for (a <- 1 to 10) {
      println("Value of a: " + a);
    }
    println(a);
    //使用until时，不包含10
    for (a <- 1 until 10) {
      println("Value of a: " + a);
    }

    //在 for 循环 中你可以使用分号 (;) 来设置多个区间，它将迭代给定区间所有的可能值
    a = 0;
    var b = 0;
    for (a <- 1 to 3; b <- 1 to 4) {
      println("a=" + a);
      println("b=" + b);
    }

    //以下实例将循环数字集合。我们使用 List() 来创建集合
    a = 0;
    val numList = List(1, 2, 3, 4, 5, 6);

    // for 循环
    for (a <- numList) {
      println("Value of a: " + a);
    }

    println("可以用多个IF判断符合条件的");
    for (a <- numList
         if a != 3; if a < 6) {
      println("Value of a: " + a);
    }

    println("retVal 是变量， 循环中的 yield 会把当前的元素记下来,保存在集合中，最后返回")
    var retVal = for {a <- numList
                      if a != 3; if a < 5
    } yield a

    // 输出返回值
    for (b <- retVal) {
      println("Value of b: " + b);
    }


  }
}
