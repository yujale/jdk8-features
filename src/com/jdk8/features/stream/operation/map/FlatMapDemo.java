package com.jdk8.features.stream.operation.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

  public static void main(String[] args) {
    List<List<Integer>> nestedList = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6),
        Arrays.asList(7, 8, 9)
    );

    List<Integer> flattenedList = nestedList.stream()
        .flatMap(List::stream)
        .collect(Collectors.toList());

    System.out.println(flattenedList); // 输出 [1, 2, 3, 4, 5, 6, 7, 8, 9]

    List<String> words = Arrays.asList("Hello", "Stream", "API");

    List<Character> characters = words.stream()
        .flatMap(str -> str.chars().mapToObj(c -> (char) c))
        .collect(Collectors.toList());

    System.out.println(characters); // 输出 [H, e, l, l, o, S, t, r, e, a, m, A, P, I]
  }

}
