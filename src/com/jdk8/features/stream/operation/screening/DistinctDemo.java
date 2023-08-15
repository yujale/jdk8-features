package com.jdk8.features.stream.operation.screening;


import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {

  public static void main(String[] args) {

    List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5, 5, 5);

    List<Integer> distinctNumbers = numbers.stream()
        .distinct()
        .collect(Collectors.toList());
    System.out.println("Distinct numbers: " + distinctNumbers);
  }
}