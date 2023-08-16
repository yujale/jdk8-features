package com.jdk8.features.stream.operation.slice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitDemo {

  // limit 方法允许我们从一个流中获取指定数量的元素。它接受一个 long 类型的参数，表示限制输出结果的大小。

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    numbers.stream()
        .limit(3)
        .forEach(System.out::println);
  }
  // 在这个例子中，我们创建了一个包含整数的列表。我们首先将其转换为流，然后使用 limit 方法只获取前三个元素。最后，我们使用 forEach 方法打印输出结果。
  // 通过 limit 方法，我们限制了输出结果的大小，只获取了前三个元素。除了以上的基本用法之外，limit 方法还可以和其他 Stream 方法一起使用，进行更复杂的操作。

  /**
   * 在实际开发中，limit 方法经常用于分页查询或者处理大型数据集合时限制结果的大小。它可以帮助我们提高性能，减少内存消耗。
   *
   * 需要注意的是，limit 方法只会获取流中的前 N 个元素，不会进行其他操作。如果需要对流进行其他操作，可以在 limit 方法之前或之后链式调用其他 Stream 方法。
   */

  /**
   * 源码分析
   *
   * 对于limit方法的实现，它会接收截取的长度，如果该值小于0，则抛出异常，否则会继续向下调用SliceOps.makeRef()。该方法中this代表当前流，skip代表需要跳过元素，比方说本来应该有4个元素，当跳过元素值为2，会跳过前面两个元素，获取后面两个。maxSize代表要截取的长度
   *
   * 在makeRef方法中的unorderedSkipLimitSpliterator()中接收了四个参数Spliterator，skip(跳过个数)、limit(截取个数)、sizeIfKnown(已知流大小)。如果跳过个数小于已知流大小，则判断跳过个数是否大于0，如果大于则取截取个数或已知流大小-跳过个数的两者最小值，否则取已知流大小-跳过个数的结果，作为跳过个数。
   * 最后对集合基于跳过个数和截取个数进行切割。
   */
}
