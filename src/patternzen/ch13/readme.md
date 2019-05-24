# 原型模式

* Specify the kinds of objects to create using a prototypical instance,and create new objects by copying this prototype.
*（用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。）

### 浅拷贝和深拷贝

例子 `example1` 中的拷贝，Object 类提供的方法 clone 只是拷贝本对象，其对象内部的数组、引用对象等都不拷贝，还是指向原生对象的内部元素地址，这种拷贝就叫浅拷贝。两个对象共享了一个私有变量，是一种非常不安全的方式。在实际项目中使用还是很少的。



