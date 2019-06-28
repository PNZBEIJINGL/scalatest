package com.test

object ScalaOperatorTest {
  //方法定义
  def addInt(a: Int, b: Int): Int = {
    var sumVar = 0;
    sumVar = a + b;
    return sumVar;
  }

  def main(args: Array[String]) {
    println("运算符测试：");
    var a1 = 15;
    var b1 = 5;
    var c1 = 31;
    var d1 = 30;
    println("a1+ b1= " + (a1 + b1));
    println("a1- b1= " + (a1 - b1));
    println("a1* b1= " + (a1 * b1));
    println("b1/ a1= " + (b1 / a1));
    println("b1% a1= " + (b1 % a1));
    println("c1% d1= " + (c1 % d1));

    println("关系符测试：a2 = 15 b2 = 20");
    val a2 = 15;
    val b2 = 20;
    println("a2  b2 = " + (a2 == b2));
    println("a2  b2 = " + (a2 != b2));
    println("a2 > b2 = " + (a2 > b2));
    println("a2 < b2 = " + (a2 < b2));
    println("b2 >= a2 = " + (b2 >= a2));
    println("b2 <= a2 = " + (b2 <= a2));

    println("逻辑运算测试：a3 = true b3 = false");
    val a3 = true;
    val b3 = false;

    println("a3 && b3 = " + (a3 && b3));
    println("a3 || b3 = " + (a3 || b3));
    println("!(a3 && b3) = " + !(a3 && b3));

    println("位u运算：a3 = true b3 = false");
    var a = 10;
    var b = 20;
    var c = 0;
    c = a + b;
    println("c = a + b  = " + c );
    c += a ;
    println("c += a  = " + c );
    c -= a ;
    println("c -= a = " + c );
    c *= a ;
    println("c *= a = " + c );

    a = 10;
    c = 15;
    c /= a ;
    println("c /= a  = " + c );

    a = 10;
    c = 15;
    c %= a ;
    println("c %= a  = " + c );

    c <<= 2 ;
    println("c <<= 2  = " + c );

    c >>= 2 ;
    println("c >>= 2  = " + c );

    c >>= 2 ;
    println("c >>= a  = " + c );

    c &= a ;
    println("c &= 2  = " + c );

    c ^= a ;
    println("c ^= a  = " + c );

    c |= a ;
    println("c |= a  = " + c );

  }


}
