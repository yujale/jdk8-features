package com.jdk8.features.stream.operation.matching;

import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 8, 4, 9, 2, 7);

    boolean hasNumberGreaterThanFive = numbers.stream()
        .anyMatch(number -> number > 5);

    System.out.println(hasNumberGreaterThanFive); // 输出 true

  }

}
