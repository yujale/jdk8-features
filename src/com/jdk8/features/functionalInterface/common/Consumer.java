package com.jdk8.features.functionalInterface.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Consumer 是 JDK8 提供的函数式接口，用于进行获取数据的操作，其内部定义了一个抽象方法 accept、一个默认方法 andThen。
 */
public class Consumer {

  /**
   * 对于accept()方法来说，它接受一个泛型T对象。如果现在需要访问类型T对象，并对其进行某些操作的话，就可以使用这个接口。
   * @param strings  List<String>
   * @param consumer java.util.function.Consumer<String>
   */
  public static void forEach(List<String> strings, java.util.function.Consumer<String> consumer) {
    for (String string : strings) {
      consumer.accept(string);
    }
  }

  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();
    strings.add( "a");
    strings.add( "b");
    strings.add( "c");
    strings.add( "d");

    forEach(strings, string -> System.out.println(string));
  }

}
