package com.rajeshanthari.designpatterns.creational.abstrac.factory;
public class RoundedRectangle implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside RoundedRectangle::draw() method.");
   }
}