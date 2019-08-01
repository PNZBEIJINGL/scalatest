package com.collection

object ScalaClassTest {
  def main(args: Array[String]): Unit = {

    //使用new 关键字创建对象
    val name=new ScalaPersion("zhangsan");
    name.print();

    val footplayer=new FootballPlayer("lisi");
    footplayer.print();
    footplayer.sayhi();


    //测试报错
    //var sc = new ScalaCompanion("test");
    //sc.printing();
  }

}
