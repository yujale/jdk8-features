package com.jdk8.features.functionalInterface.common;

/**
 * Supplier也是用来进行值获取操作，内部只有一个抽象方法 get
 */
public class Supplier {
  public static Integer getMin(java.util.function.Supplier<Integer> supplier) {
    return supplier.get();
  }

  public static void main(String[] args) {

    int[] arr = {100, 0, -50, 88, 99, 33, -30};

    Integer result = getMin(() -> {
      int min = arr[0];
      for (int i : arr) {
        if (i < min) {
          min = i;
        }
      }
      return min;
    });
    System.out.println(result);
  }

}
