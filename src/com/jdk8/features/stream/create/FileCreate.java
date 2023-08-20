package com.jdk8.features.stream.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileCreate {

  public static void main(String[] args) {
    String filePath = "data.txt";

    try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
      // 对每一行数据进行操作
      lines.filter(line -> line.contains("Java"))
          .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
