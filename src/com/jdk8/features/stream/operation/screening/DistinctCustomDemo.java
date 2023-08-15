package com.jdk8.features.stream.operation.screening;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

//  @Override
//  public boolean equals(Object obj) {
//    if (obj instanceof Person) {
//      return this.name.equals(((Person) obj).name);
//    }
//    return false;
//  }
//
//  @Override
//  public int hashCode() {
//    return this.name.hashCode();
//  }
}

/**
 * 如果根据自定义的逻辑来判断元素是否重复，可以结合 `equals` 和 `hashCode` 方法的重写，或者使用 `Comparator` 来自定义比较。
 */
public class DistinctCustomDemo {

  public static void main(String[] args) {
    // 创建 Person 对象集合
    List<Person> people = List.of(
        new Person("Alice"),
        new Person("Bob"),
        new Person("Alice")
    );

    // 由于 Person 类重写了 equals 和 hashCode 方法，所以可以使用 distinct 方法来去重
//    List<Person> distinctPeople = people.stream()
//        .distinct()
//        .collect(Collectors.toList());




    // 如果 Person 类没有重写 equals 和 hashCode 方法，那么可以使用 distinct 方法的重载版本，传入自定义的比较器来去重

    List<Person> distinctPeople = people.stream()
        .distinct().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());


    System.out.println("Distinct people: " + distinctPeople.stream().map(Person::getName).collect(Collectors.toList()));
  }

}
