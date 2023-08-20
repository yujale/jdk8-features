package com.jdk8.features.stream.operation.find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstDemo {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

    Optional<String> firstWordStartingWithA = words.stream()
        .filter(word -> word.startsWith("a"))
        .findFirst();

    if (firstWordStartingWithA.isPresent()) {
      System.out.println("Found: " + firstWordStartingWithA.get()); // 输出 Found: apple
    } else {
      System.out.println("Not found");
    }
  }

}
