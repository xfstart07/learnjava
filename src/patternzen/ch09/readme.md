# 抽象工厂模式

定义：

* Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
* 为创建一组相关或相互依赖的对象提供一个接口，而且无须指定它们的具体类。

## 缺点

抽象工厂模式的最大缺点就是产品族扩展非常困难，为什么这么说呢？我们以通用代码为例，如果要增加一个产品C，也就是说产品家族由原来的2个增加到3个，改动太大。