# 适配器模式

适配器模式（Adapter Pattern）的定义如下：

Convert the interface of a class into another interface clients expect.Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
（将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。）

## 适配器模式的使用场景

你有动机修改一个已经投产中的接口时，适配器模式可能是最适合你的模式。

## 注意事项

项目一定要遵守依赖倒置原则和里氏替换原则，否则即使在适合使用适配器的场合下，也会带来非常大的改造。

## 例子

* example1 适配器实现 - 类适配器
* example2 适配器扩展 - 对象适配器
