package com.jdk8.features.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {

  public static void main(String[] args) {
    String[] languages = {"Java", "Python", "C++", "PHP", "JavaScript", "C#", "Go", "Swift", "Kotlin", "Rust"};

    List<String> langList = Arrays.asList(languages);
    for (String s : langList) {
      System.out.println(s);
    }

    System.out.println("=====================================");

    langList.forEach(s -> System.out.println(s));

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("runnable");
      }
    };

    // lambda 改造匿名内部类

    Runnable runnable1 = () -> System.out.println("lambda runnable");

    // 集合原有排序

    Arrays.sort(languages, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });

    // lambda 改造集合原有排序

    Arrays.sort(languages, (o1, o2) -> o1.compareTo(o2));
  }





}
