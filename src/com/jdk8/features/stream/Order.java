package com.jdk8.features.stream;

public class Order {

  private int id;
  private String name;

  private Integer price;

  private String date;


  public Order() {
  }

  public Order(int id, String name, Integer price, String date) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.date = date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }

  public Integer getPrice() {
    return price;
  }

  public String getDate() {
    return date;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Oder{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", date='" + date + '\'' +
        '}';
  }

}
