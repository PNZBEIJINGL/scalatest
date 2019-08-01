package com.collection

class ScalaCompanion private(msg: String) {



  private [ScalaCompanion] def printing(): Unit = {
    println("msg");
  }

}

/**
  * 当单例对象与某个类共享同一个名称时，他被称作是这个类的伴生对象：companion object
  * 你必须在同一个源文件里定义类和它的伴生对象
  * 类被称为是这个单例对象的伴生类：companion class。类和它的伴生对象可以互相访问其私有成员
  */
object ScalaCompanion {

  def main(args: Array[String]): Unit = {
    var sc = new ScalaCompanion("test");
    sc.printing();
  }
}
