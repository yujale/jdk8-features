package com.jdk8.features.functionalInterface.common;

/**
 * Function主要用于进行类型转换的操作。内部提供一个抽象方法apply、两个默认方法compose，andThen、一个静态方法identity
 */
public class Function {

  /**
   对于apply方法，它接收一个泛型T对象，并返回一个泛型R的对象。如果需要将T类型的对象转换为R类型，就可以使用这个接口。
   * @param s String
   * @param function java.util.function.Function<String, Integer>
   * @return
   */
  public static Integer convert(String s, java.util.function.Function<String, Integer> function) {
    return function.apply(s);
  }

  public static void main(String[] args) {
    Integer convert = convert("10", string -> Integer.parseInt(string));
    System.out.println(convert);
  }
}
