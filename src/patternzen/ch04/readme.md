# 接口隔离原则

那什么是隔离呢？它有两种定义，如下所示：

* Clients should not be forced to depend upon interfaces that they don't use.（客户端不应该依赖它不需要的接口。）

* The dependency of one class to another one should depend on the smallest possible interface.
（类间的依赖关系应该建立在最小的接口上。）

## 例子

* example1 普通接口实现
* example2 区分职责的接口实现