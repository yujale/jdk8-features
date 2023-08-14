package com.jdk8.features.stream.ListCompStream;

import com.jdk8.features.stream.Order;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
  public static void main(String[] args) {

    java.util.List<Order> orders = new ArrayList<>();
    orders.add( new Order(1, "水果", 18, "2023-08-13"));
    orders.add( new Order(2, "衣服", 59, "2023-08-12"));
    orders.add( new Order(3, "日用品", 28, "2023-08-11"));
    orders.add( new Order(4, "电子产品", 8999, "2023-08-10"));
    orders.add( new Order(5, "图书", 128, "2023-08-09"));

    // 直接遍历输出
    orders.stream()
        .filter(order -> order.getPrice() > 100) // 过滤出价格大于100的订单
        .sorted(Comparator.comparing(Order::getDate)) // 按照日期进行排序
        .map(Order::getName)// 取出订单名称
        .forEach(System.out::println); // 遍历输出

    // 得到新的集合进行输出
    List<String> result = orders.stream()
        .filter(order -> order.getPrice() > 100).sorted(Comparator.comparing(Order::getDate))
        .map(Order::getName).collect(Collectors.toList());
    System.out.println(result);
  }
}
