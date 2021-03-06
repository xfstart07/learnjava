# 里氏替换原则，Liskov Substitution Principle，LSP

定义：通俗点讲，**只要父类能出现的地方子类就可以出现，而且替换为子类也不会产生任何错误或异常，使用者可能根本就不需要知道是父类还是子类。但是，反过来就不行了，有子类出现的地方，父类未必就能适应。**

LSP 定义包含 4 层含义：

* 1.子类必须完全实现父类的方法

> 注意　在类中调用其他类时务必要使用父类或接口，如果不能使用父类或接口，则说明类的设计已经违背了LSP原则。

* 2.子类可以有自己的个性

* 3.覆盖或实现父类的方法时输入参数可以被放大

* 4.覆写或实现父类的方法时输出结果可以被缩小

## 例子

* example1 枪例子