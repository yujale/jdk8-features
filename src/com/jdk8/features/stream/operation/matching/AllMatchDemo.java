package com.jdk8.features.stream.operation.matching;

import java.util.Arrays;
import java.util.List;

public class AllMatchDemo {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

    boolean allWordsHaveLengthThreeOrMore = words.stream()
        .allMatch(word -> word.length() >= 3);

    System.out.println(allWordsHaveLengthThreeOrMore); // 输出 true

  }

}
