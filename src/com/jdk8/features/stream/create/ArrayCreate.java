package com.jdk8.features.stream.create;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayCreate {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    IntStream stream = Arrays.stream(numbers);

    // 对流进行操作，例如过滤、映射、归约等
    stream.filter(num -> num % 2 == 0)
        .map(num -> num * num)
        .forEach(System.out::println);
  }

}
