package com.jdk8.features.stream.listCompStream;

import com.jdk8.features.stream.Order;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ListDemo {

  public static void main(String[] args) {

    java.util.List<Order> orders = new ArrayList<>();
    orders.add( new Order(1, "水果", 18, "2023-08-13"));
    orders.add( new Order(2, "衣服", 59, "2023-08-12"));
    orders.add( new Order(3, "日用品", 28, "2023-08-11"));
    orders.add( new Order(4, "电子产品", 8999, "2023-08-10"));
    orders.add( new Order(5, "图书", 128, "2023-08-09"));
    java.util.List<Order> result = new ArrayList<>();

    for (Order order : orders) {
      if (order.getPrice() > 100){
        result.add(order);
      }
    }

    Collections.sort(result,new Comparator<Order>(){
      @Override
      public int compare(Order o1, Order o2) {
        return Integer.compare(o1.getPrice(),o2.getPrice());
      }
    });

    ArrayList<Order> names = new ArrayList<>();

    for (Order order : result) {
      names.add(order);
    }
    System.out.println(names.toString());

  }

}