# 依赖倒置原则

依赖倒置原则的原始定义是：

High level modules should not depend upon low level modules.Both should depend upon abstractions.Abstractions should not depend upon details.Details should depend upon abstractions.

翻译过来，包含三层含义：

* 高层模块不应该依赖低层模块，两者都应该依赖其抽象；
* 抽象不应该依赖细节；
* 细节应该依赖抽象。

更加精简的定义就是“面向接口编程”——OOD（Object-Oriented Design，面向对象设计）的精髓之一。

## 依赖的三种写法

* 1.构造函数传递依赖对象

```java
// 构造函数注入
public Driver(ICar _car){               
    this.car = _car;      
}
```

* 2.Setter方法传递依赖对象

```java 
private ICar car;       
public void setCar(ICar car){              
    this.car = car;      
}
```

* 3. 接口声明依赖对象

```java 
public void drive(ICar car){              
    car.run();      
}
```