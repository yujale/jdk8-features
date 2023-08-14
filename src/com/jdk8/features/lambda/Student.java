package com.jdk8.features.lambda;

public class Student {
  private String name;
  private int age;
  private int score;


  public Student() {
    super();
  }
  public Student(String name, int age, int score) {
    super();
    this.name = name;
    this.age = age;
    this.score = score;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public int getScore() {
    return score;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setScore(int score) {
    this.score = score;
  }
  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
  }

}
