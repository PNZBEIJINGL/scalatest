package com.test.com.test.collection

import scala.Array._

/**
  * 数组一些测试
  */
object ScalaArrayTest {
  def main(args: Array[String]): Unit = {

    println("------数组------")
    //数组的第一个元素索引为0，最后一个元素的索引为元素总数减1
    var arr = Array[Int](10, 9, 3, 2, 9);
    print("arr(9/3)=a(3)=" + arr(9 / 3));
    for (a <- arr) {
      print(a + ",")
    }
    println();

    var sum = 0;
    for (i <- 0 to arr.length - 1) {
      sum += arr(i);
    }
    println("sum=" + sum);

    var max = 0;
    for (i <- 0 to arr.length - 1) {
      if (max < arr(i)) {
        max = arr(i);
      }
    }
    println("max=" + max);

    println("------多维数组------")
    var myMatrix = ofDim[Int](3, 3)

    // 创建矩阵
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    // 打印二维阵列
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }

    println("------数组合并 concat------");
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    var myList3 = concat(myList1, myList2)
    // 输出所有数组元素
    for (x <- myList3) {
      println(x)
    }

    println("------数组步长 range------");
    var list1 = range(2, 10, 2);
    var list2 = range(2, 10); //最后参数默认为1

    for (x <- list1) {
      print(x + " ");
    }
    println();
    for (x <- list2) {
      print(x + " ");
    }
    println();

  }
}
