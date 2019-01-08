import java.util.Scanner;
// By: Emil Flores / Assignment 2 / CSD 141
public class Geometry {
    public static void main(String... args) {
        // integer variable to store the choice
        int choice = 0;
        // scanner to get the user input
        Scanner scanner = new Scanner(System.in);
        do {
            // print the menu
            System.out.println("Geometry Calculator:\n" +
                    "1.\tCalculate the Area of a Circle\n" +
                    "2.\tCalculate the Area of a Rectangle\n" +
                    "3.\tCalculate the Area of a Triangle\n" +
                    "4.\tQuit\n" +
                    "\n" +
                    "Enter your choice (1 – 4):\n");
            choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("Enter the radius of the circle: ");//Get user input per radius of circle 
                double radius = scanner.nextDouble();//Convert to double
                if(radius < 0){
                    System.out.println("Radius can not be negative"); //Inform user that number cannot be negative
                    return;
                }
                // printing formatted area of the circle
                System.out.println("Area of the circle is: " + String.format("%.2f", (Math.PI * radius * radius * 0.5)));
            }
            else if(choice == 2){
                System.out.println("Enter the length of the rectangle: ");//Get user input per length of rectangle 
                double length = scanner.nextDouble();
                if(length < 0){
                    System.out.println("Length can not be negative"); //Inform user that number cannot be negative
                    return;
                }
                System.out.println("Enter the width of the rectangle: ");//Get user input per width of rectangle 
                double width = scanner.nextDouble();
                if(width < 0){
                    System.out.println("Width can not be negative"); //Inform user that number cannot be negative
                    return;
                }// printing formatted area of the rectangle
                System.out.println("Area of the rectangle is: " + String.format("%.2f", (length * width)));

            }
            else if(choice == 3){
                System.out.println("Enter the base of the triangle: ");//Get user input per base of triangle 
                double base = scanner.nextDouble();
                if(base < 0){
                    System.out.println("Base can not be negative");//Inform user that number cannot be negative
                    return;
                }
                System.out.println("Enter the height of the triangle: ");//Get user input per height of triangle 
                double height = scanner.nextDouble();
                if(height < 0){
                    System.out.println("Height can not be negative"); //Inform user that number cannot be negative
                    return;
                }// printing formatted area of the triangle
                System.out.println("Area of the triangle is: " + String.format("%.2f", (base * height) * 0.5));

            }
            else if(choice < 1 || choice > 4){//if user enters invalid choice
                System.out.println("Not a valid choice");
                return;
            }
        } while (choice != 4);
        scanner.close();
    }
}
