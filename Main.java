package com.convertnum;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  
  System.out.println("Enter binary number: ");
  Scanner in = new Scanner(System.in);
  String num = in.nextLine();
  int decimal = Integer.parseInt(num, 2);
  System.out.print("In decimal: " + decimal);
  
  }
}
