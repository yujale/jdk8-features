package com.jdk8.features.stream.create;

import java.util.stream.Stream;

public class StreamBuilderCreate {
  public static void main(String[] args) {
    Stream.Builder<String> builder = Stream.builder();

    builder.add("apple")
        .add("banana")
        .add("orange");

    Stream<String> stream = builder.build();

    stream.forEach(System.out::println);
  }

}
