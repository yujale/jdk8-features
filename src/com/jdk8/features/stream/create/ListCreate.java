package com.jdk8.features.stream.create;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListCreate {

  public static void main(String[] args) {
    List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

    Stream<String> stream = fruits.stream();

    // 对流进行操作，例如过滤、映射、归约等
    stream.filter(fruit -> fruit.length() > 5)
        .map(String::toUpperCase)
        .forEach(System.out::println);
  }

}
