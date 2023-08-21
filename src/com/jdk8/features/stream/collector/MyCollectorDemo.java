package com.jdk8.features.stream.collector;

import com.jdk8.features.lambda.Student;
import java.util.ArrayList;
import java.util.List;

public class MyCollectorDemo {

  public static void main(String[] args) {

    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student(1,"张三",18,19));
    studentList.add(new Student(2,"李四",19,18));
    studentList.add(new Student(3,"王五",20,21));
    studentList.add(new Student(4,"赵六",21,80));

    List<Student> list = studentList.stream().collect(new MyCollector());
    System.out.println(list);
  }
}
