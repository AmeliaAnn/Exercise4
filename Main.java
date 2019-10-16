package com.convertnum;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  
  System.out.println("Enter decimal number: ");
  Scanner in = new Scanner(System.in);
  int num = in.nextInt();
  System.out.println("Number " + num + " in binary: ");
  System.out.println(Integer.toBinaryString(num));
  }
}
