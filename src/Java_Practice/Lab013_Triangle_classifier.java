package Java_Practice;

import java.util.Scanner;

public class Lab013_Triangle_classifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter side A :");
        int sideA = sc.nextInt();
        System.out.println("Please enter side B :");
        int sideB = sc.nextInt();
        System.out.println("Please enter side C :");
        int sideC = sc.nextInt();

        if(sideA==sideB && sideA==sideC){
            System.out.println("This is equilateral triangle.");
        }else if(sideA==sideB || sideB==sideC || sideA==sideC){
            System.out.println("This is isosceles triangle.");
        }else{
            System.out.println("This is scelene triangle.");
        }


    }
}

//Write a program that classifies a triangle based on its side lengths. Given three input values representing
//the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles
//    (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify
//the triangle.
