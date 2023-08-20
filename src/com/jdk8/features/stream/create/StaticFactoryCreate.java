package com.jdk8.features.stream.create;

import java.util.stream.Stream;

public class StaticFactoryCreate {

  public static void main(String[] args) {
    // 1. Stream.of()： 创建一个由指定元素组成的流。
    Stream<String> stream = Stream.of("apple", "banana", "orange");
    // 2. Stream.iterate()： 生成一个无限流，通过迭代生成元素。
    Stream<Integer> stream1 = Stream.iterate(1, n -> n * 2); // 1, 2, 4, 8, ...

    // 3. Stream.generate()： 生成一个无限流，通过提供的 Supplier 生成元素。
    Stream<Double> stream2 = Stream.generate(Math::random); // 0.123..., 0.456..., ...

    Stream<Integer> stream3 = Stream.iterate(0, n -> n + 1)
        .filter(n -> n % 2 == 0)
        .limit(10);



  }

}
