package com.sbs.jdbc;

import com.sbs.jdbc.container.Container;

import java.util.Scanner;

public class App {

  public void run() {
    Scanner sc = Container.scanner;

    while(true) {
      System.out.println("명령어)");
      String cmd = sc.nextLine();

      if(cmd.equals("/user/article/list")){
        System.out.println("==게시물 리스트==");
      }
      else if(cmd.equals("exit")) {
        System.out.println("프로그램 종료");
        break;
      }
    }
    sc.close();
  }
}
