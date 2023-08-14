package com.jdk8.features.functionalInterface.common;

import com.jdk8.features.lambda.Student;
import java.util.ArrayList;
import java.util.List;

/**
 * Predicate接口是Java8定义的一个函数式接口，属于java.util.function包下，用于进行判断操作，内部定义一个抽象方法test、三个默认方法and，negate，or、一个静态方法isEqual
 */
public class Predicate {


  public static List<Student> filter(List<Student> students, java.util.function.Predicate<Student> predicate) {
    ArrayList<Student> arrayList = new ArrayList<>();
    students.forEach(student -> {
      if (predicate.test(student)) {
        arrayList.add(student);
      }
    });
    return arrayList;
  }

  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("张三", 18, 80));
    students.add(new Student("李四", 19, 90));
    students.add(new Student("王五", 20, 100));
    students.add(new Student("赵六", 21, 60));
    students.add(new Student("田七", 22, 70));

    List<Student> result = filter(students, student -> student.getAge() > 20);

    System.out.println(result.toString());
  }
}
