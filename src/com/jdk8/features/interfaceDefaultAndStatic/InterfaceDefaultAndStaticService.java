package com.jdk8.features.interfaceDefaultAndStatic;

// 在接口中定义的普通方法都是抽象方法，方法前面都会默认添加 `public abstract`，不能有方法实现，需要在接口的实现类中对方法进行具体实现
// 但是在 java8 中，接口中可以定义默认方法和静态方法，这两种方法都有方法实现，不需要在接口的实现类中对方法进行具体实现
public interface InterfaceDefaultAndStaticService {

  public String abstractMethod();

//默认方法：扩展方法，在方法前面需通过 default 修饰。
// 不能直接通过接口调用，必须通过接口实现类的实例对象进行方法调用 `接口实现类对象.默认方法()`
  default String defaultMethod() {
    return "defaultMethod";
  }


  // 静态方法：类方法，在方法前面需通过 static 修饰。可以直接通过接口调用。 `接口.静态方法()`

  static String staticMethod() {
    return "staticMethod";
  }

}
