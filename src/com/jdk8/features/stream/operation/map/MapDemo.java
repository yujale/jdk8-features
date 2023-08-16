package com.jdk8.features.stream.operation.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

  public static void main(String[] args) {
    // 什么是映射？
    //在开发中，我们常常需要对集合中的元素进行一些处理，比如提取属性、计算值或者进行转换。映射操作就是将一个集合的每个元素应用某个函数，并将返回值形成一个新的集合。

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> squares = numbers.stream()
        .map(n -> n * n)
        .collect(Collectors.toList());

    // 上述代码中，map() 方法将集合中的每个元素进行平方计算，并将计算结果组成一个新的集合。

    List<String> words = Arrays.asList("hello", "world");
    List<String> letters = words.stream()
        .flatMap(s -> Arrays.stream(s.split("")))
        .collect(Collectors.toList());


    // 上述代码中，flatMap() 方法将字符串拆分成字符，并将所有字符组合成一个新的集合。
    /**
     * 应用实例：
     * 下面我们来看一个实际应用的例子，假设我们有一个学生成绩的集合，我们需要将每个学生的成绩加上10，再将结果集合输出。示例代码如下：
     *
     * ```java
     * class Student {
     *     String name;
     *     int score;
     *
     *     public Student(String name, int score) {
     *         this.name = name;
     *         this.score = score;
     *     }
     *
     *     // getters and setters
     * }
     *
     * List<Student> students = Arrays.asList(
     *         new Student("Alice", 80),
     *         new Student("Bob", 90),
     *         new Student("Charlie", 70)
     * );
     *
     * List<Integer> updatedScores = students.stream()
     *                                       .map(s -> s.getScore() + 10)
     *                                       .collect(Collectors.toList());
     *
     * updatedScores.forEach(System.out::println);
     * ```
     *
     * 上述代码中，我们利用 map() 方法将每个学生的成绩加上10，然后通过 collect(Collectors.toList()) 方法将结果收集到一个新的集合中，并最后通过 forEach(System.out::println) 方法输出结果。
     *
     * 总结：
     * Java 8 的 Stream API 提供了强大且方便的映射操作方法，通过 map() 和 flatMap() 方法，我们可以简化集合的转换和处理操作。在实际应用中，我们可以根据实际需求选择合适的映射操作方法，并结合其他流操作进行复杂的数据处理。搭配使用 Stream API 的流式编程风格，能够提高代码的可读性和简洁性。
     *
     * 源码分析
     *
     * 将当前流给定函数中的元素，包含到一个新的流中进行返回。
     * 其会接收一个Function函数式接口，内部接收一个内部对Function函数式接口中的apply方法进行实现，接收一个对象，返回另外一个对象，并把这个内容存入当前流中，最后返回。
     */

  }

}
