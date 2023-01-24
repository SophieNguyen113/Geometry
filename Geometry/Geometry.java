import java.util.Scanner;
/**
  * Programming Project 4
  * This program completes a geometry calculator program.
  * @author Sophie Nguyen
  * @version 03/31/2022
  */

public class Geometry
{
   /**
     * Outputs the welcome message and 3 options for the user.
     * No @param 
     * No @return 
     */
   public static void displayMenu()
   {
      System.out.println("Welcome to the Geometry Calculator Application");
      System.out.println("");
      System.out.println("1. Calculate the Area of a Circle");
      System.out.println("2. Calculate the Area of a Rectangle");
      System.out.println("3. Calculate the Area of a Triangle");
   }
   
   /**
     * Computes the area of a circle.
     * No @param 
     * @return the area
     */
   public static double circleArea()
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is the circle's radius? ");
      double radius = in.nextDouble();
      double area = Math.PI * radius * radius;
      return area;
   }
   
   /**
     * Computes the area of a rectangle.
     * No @param 
     * @return the area
     */
   public static double reactangleArea()
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is the rectangle's length? ");
      double length = in.nextDouble();
      System.out.print("What is the rectangle's width? ");
      double width = in.nextDouble();
      double area = length * width;
      return area;
   }
   
   /**
     * Computes the area of a triangle.
     * No @param 
     * @return the area
     */
   public static double triangleArea()
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is the length of the triangle's base? ");
      double length = in.nextDouble();
      System.out.print("What is the triangle's height? ");
      double height = in.nextDouble();
      double area = 0.5 * length * height;
      return area;
   }
   
   /**
     * Outputs the area to 2 decimal places.
     * @param the area
     * No @return 
     */
   public static void printArea(double area)
   {
      System.out.printf("The area is %.2f", area);
   }
   
   /**
     * Checks if the input for the choice is equal to 1, equal to 2, or equal to 3.
     * @param the input for the choice of the user
     * No @return 
     */
   public static void selectOption(int input)
   {
      double area;
      if (input == 1)
      {
         area = circleArea();
         printArea(area);
      }
      else if (input == 2)
      {
         area = reactangleArea();
         printArea(area);
      }
      else if (input == 3)
      {
         area = triangleArea();
         printArea(area);
      }
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      displayMenu();
      System.out.print("Enter your choice (1-3): ");
      int choice = in.nextInt(); 
      
      /**
        * Validates that the choice is less than 1 or greater than 3.
        * If it is, output an "invalid" message and prompt the user to enter again.
        */
      boolean valid = true;     
      while(valid)
      {
         if (choice < 1 || choice > 3)
         {
            System.out.print("Invalid choice. Please enter 1 - 3: ");
            choice = in.nextInt();
         }
         else
         {
            valid = false;
         }   
      }
      
      selectOption(choice);
      System.out.println("\n");
      System.out.println("Thanks for using the Geormetry Calculator - Goodbye!"); 
    }
}