package com.jdk8.features.stream.operation.slice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// skip 方法允许我们从一个流中跳过指定数量的元素。它接受一个 long 类型的参数，表示要跳过的元素个数。
public class SkipDemo {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    numbers.stream()
        .skip(2)
        .forEach(System.out::println);
  }
  // 在这个例子中，我们创建了一个包含整数的列表。我们首先将其转换为流，然后使用 skip 方法跳过前两个元素。最后，我们使用 forEach 方法打印输出结果。

  // 通过 skip 方法，我们跳过了前两个元素，输出结果只包含了剩余的三个元素。除了以上的基本用法之外，skip 方法还可以和其他 Stream 方法一起使用，进行更复杂的操作。

  // 在实际开发中，skip 方法经常用于分页查询或者处理大型数据集合时跳过一定数量的元素。它可以帮助我们定位到我们所需的特定位置的元素。
  // 需要注意的是，skip 方法只会跳过流中的前 N 个元素，不会进行其他操作。如果需要对流进行其他操作，可以在 skip 方法之前或之后链式调用其他 Stream 方法。

  /**
   * 源码分析
   *
   * 在skip方法中接收的n代表的是要跳过的元素个数，如果n小于0，抛出非法参数异常，如果n等于0，则返回当前流。如果n小于0，才会调用makeRef()。同时指定limit参数为-1.
   *
   * 此时可以发现limit和skip都会进入到该方法中，在确定limit值时，如果limit<0,则获取已知集合大小长度-跳过的长度。最终进行数据切割。
   */

}
