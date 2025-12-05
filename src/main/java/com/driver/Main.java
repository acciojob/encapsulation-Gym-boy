package com.driver;

public class Main {
  public static void main(String...args){
    RWOnly rwonly= new RWOnly();
      rwonly.setName= "Chetan";
      System.out.print(rwonly.getName());
  }
}
