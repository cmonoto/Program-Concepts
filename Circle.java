//************************************************************************************
// Circle.java
// Jinhao Chen
// Print the area of a circle with two different radii
//************************************************************************************

public class Circle
{
    public static void main(String[] args)
    {
     final double PI = 3.14159;
     
     int radius1 = 10;
     double area1 = PI * radius1 * radius1; 
     
     double circumference1 = PI * radius1 * 2;

     System.out.println("The area1 of a circle with radius " + radius1 +
                        " is " + area1);
     System.out.println("The Circumference1 of a circle with radius " + radius1 +
                        " is " + circumference1);

     int radius2 = 20;
     double area2 = PI * radius2 * radius2;
     
     double circumference2 = PI * radius2 * 2;
     
     System.out.println("The area2 of a circle with radius " + radius2 +
                        " is " + area2);
     
     System.out.println("The Circumference2 of a circle with radius " + radius2 +
                        " is " + circumference2);
     double change1 = area2 / area1;
     
     System.out.println("The change in area is " + change1);
     
     double change2 = circumference2 / circumference1;
     
     System.out.println("The change in circumference is " + change2);
     
     
     
     
      }
}

