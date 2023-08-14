package com.jdk8.features.interfaceDefaultAndStatic;

public class InterfaceDefaultAndStatic {

  public static void main(String[] args) {
    String s = new InterfaceDefaultAndStaticServiceImpl().defaultMethod();
    System.out.println(s);
    System.out.println(InterfaceDefaultAndStaticService.staticMethod());

    // 方法重写。普通方法必须实现，默认方法可以选择性重写，静态方法无法重写。
    InterfaceDefaultAndStaticService demoService = new InterfaceDefaultAndStaticService() {
      @Override
      public String abstractMethod() {
        return null;
      }

      @Override
      public String defaultMethod() {
        return InterfaceDefaultAndStaticService.super.defaultMethod();
      }
    };
  }

}
