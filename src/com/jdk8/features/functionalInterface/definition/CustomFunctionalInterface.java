package com.jdk8.features.functionalInterface.definition;

/**
 * 在Java8中为了让现在有的函数能够更加友好的使用Lambda表达式，因此引入了函数式接口这个概念。其是一个仅有一个抽象方法的普通接口。如果声明多个抽象方法则会报错。
 * 但是默认方法和静态方法在此接口中可以定义多个。
 * 要想自定义一个函数式接口的话，需要在接口上添加 @FunctionalInterface 。
 */
@java.lang.FunctionalInterface
public interface CustomFunctionalInterface {

   void execute();


}
