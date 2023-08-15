package com.jdk8.features.stream.operation.screening;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

  public static void main(String[] args) {
    List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");
    List<String> longWords = words.stream()
        .filter(word -> word.length() > 5)
        .collect(Collectors.toList());
    System.out.println("Long words: " + longWords);
  }

}
