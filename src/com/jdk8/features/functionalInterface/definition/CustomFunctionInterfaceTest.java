package com.jdk8.features.functionalInterface.definition;

import org.junit.Test;

public class CustomFunctionInterfaceTest {

  public void test(CustomFunctionalInterface functionalInterface) {
    functionalInterface.execute();
  }

  @Test
  public void execute() {
    // java 匿名内部类
    test(new CustomFunctionalInterface(){
      @Override
      public void execute() {
        System.out.println("Hello World Custom!");
      }
    });
    System.out.println("=====================================");
    // java 8 lambda 表达式
    test(() -> System.out.println("Hello World Custom!"));
  }

}
