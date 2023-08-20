package com.jdk8.features.stream.operation.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

  public static void main(String[] args) {
    // 什么是映射？
    //在开发中，我们常常需要对集合中的元素进行一些处理，比如提取属性、计算值或者进行转换。映射操作就是将一个集合的每个元素应用某个函数，并将返回值形成一个新的集合。

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> squares = numbers.stream()
        .map(n -> n * n)
        .collect(Collectors.toList());

    // 上述代码中，map() 方法将集合中的每个元素进行平方计算，并将计算结果组成一个新的集合。

    List<String> words = Arrays.asList("hello", "world");
    List<String> letters = words.stream()
        .flatMap(s -> Arrays.stream(s.split("")))
        .collect(Collectors.toList());

  }

}
