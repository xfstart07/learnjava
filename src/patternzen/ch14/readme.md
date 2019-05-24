# 中介者模式

中介者模式的定义为：

* Define an object that encapsulates how a set of objects interact.Mediator promotes loose coupling by keeping objects from referring to each other explicitly,and it lets you vary their interaction independently.
* 用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它们之间的交互。

> 将耦合封装在中介对象中，使各个对象专注自己的业务。

## 优缺点

### 优点

同事类只依赖中介者，减少了依赖，当然同时也降低了类间的耦合。

### 缺点

中介者会膨胀得很大。而且逻辑复杂，原本N个对象直接的相互依赖关系转换为中介者和同事类的依赖关系，同事类越多，中介者的逻辑就越复杂。

### 使用场景

中介者模式适用于多个对象之间紧密耦合的情况，紧密耦合的标准是：在类图中出现了蜘蛛网状结构。在这种情况下一定要考虑使用中介者模式，这有利于把蜘蛛网梳理为星型结构，使原本复杂混乱的关系变得清晰简单。

## 实际应用

* 机场调度中心

* MVC 框架

大家都应该使用过Struts，MVC框架，其中的C（Controller）就是一个中介者，叫做前端控制器(Front Controller)，它的作用就是把M(Model，业务逻辑)和V（View，视图）隔离开，协调M和V协同工作，把M运行的结果和V代表的视图融合成一个前端可以展示的页面，减少M和V的依赖关系。

* 媒体网关

* 中介服务

## 例子

* example1 简单的进销存实现
* example2 中介模式实现进销存

