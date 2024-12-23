import java.util.Scanner;
// Abstract class Shape
abstract class Shape {
 // Abstract methods
 abstract double calculateArea();
 abstract double calculatePerimeter();
}
// Subclass Circle
class Circle extends Shape {
 private double radius;
 // Constructor
 public Circle(double radius) {
 this.radius = radius;
 }
 // Implementation of abstract methods
 @Override
 double calculateArea() {
 return Math.PI * radius * radius;
 }
 @Override
 double calculatePerimeter() {
 return 2 * Math.PI * radius;
 }
}
// Subclass Triangle
class Triangle extends Shape {
 private double side1, side2, side3;
 // Constructor
 public Triangle(double side1, double side2, double side3) {
 this.side1 = side1;
 this.side2 = side2;
 this.side3 = side3;
 }
 // Implementation of abstract methods
 @Override
 double calculateArea() {
 // Using Heron's formula
 double s = (side1 + side2 + side3) / 2;
 return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }
 @Override
 double calculatePerimeter() {
 return side1 + side2 + side3;
 }
}
// Main class to test the program
public class p6 {
 public static void main(String[] args) {
 // Circle with radius 5
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the radius of circle");
 int r=sc.nextInt();
 Shape circle = new Circle(r);
 System.out.println("Circle Area: " + circle.calculateArea());
 System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
 System.out.println("Enter the sides of the triangle");
 int s1=sc.nextInt();
 int s2=sc.nextInt();
 int s3=sc.nextInt();
 Shape triangle = new Triangle(s1, s2, s3);
 System.out.println("Triangle Area: " + triangle.calculateArea());
 System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
 }
}