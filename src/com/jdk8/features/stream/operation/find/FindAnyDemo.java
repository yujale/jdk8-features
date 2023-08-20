package com.jdk8.features.stream.operation.find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyDemo {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

    Optional<String> anyWordStartingWithA = words.stream()
        .filter(word -> word.startsWith("a"))
        .findAny();

    if (anyWordStartingWithA.isPresent()) {
      System.out.println("Found: " + anyWordStartingWithA.get()); // 输出 Found: apple 或其他以 "a" 开头的单词
    } else {
      System.out.println("Not found");
    }
  }
}
