package com.jdk8.features.stream.operation.screening;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();
    strings.add("a");
    strings.add("b");
    strings.add("c");
    strings.add("d");
    strings.add("e");

    List<String> a = strings.stream().filter(s -> s.equals("a")).collect(Collectors.toList());

    System.out.println(a.toString());
  }

}
