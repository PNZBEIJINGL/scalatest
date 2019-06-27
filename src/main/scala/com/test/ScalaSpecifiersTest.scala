package com.test

object ScalaSpecifiersTest {

  //用 private 关键字修饰，带有此标记的成员仅在包含了成员定义的类或对象内部可见，同样的规则还适用内部类。
  class InnerClass {

    //Scala中，访问修饰符可以通过使用限定词强调。格式为:private[x] ,protected[x]
    //这里的x指代某个所属的包、类或单例对象。如果写成private[x],读作"这个成员除了对[…]中的类或[…]中的包中的类及它们的伴生对像可见外，对其它所有类都是private。
    private[ScalaSpecifiersTest] def printing() {
      println("InnerClass")
    }

    class InnerMost {
      printing();
    }


  }

  def main(args: Array[String]): Unit = {
    (new InnerClass).printing();
  }

  //在 scala 中，对保护（Protected）成员的访问比 java 更严格一些。因为它只允许保护成员在定义了该成员的的类的子类中被访问。
  //而在java中，用protected关键字修饰的成员，除了定义了该成员的类的子类可以访问，同一个包里的其他类也可以进行访问。

  //Scala中，如果没有指定任何的修饰符，则默认为 public。这样的成员在任何地方都可以被访问。

}
