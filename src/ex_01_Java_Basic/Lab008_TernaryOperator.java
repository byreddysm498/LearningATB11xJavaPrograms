package ex_01_Java_Basic;

public class Lab008_TernaryOperator {
    public static void main(String[] args){

        int a= 59;
        String grade = (a<99 && a>=90) ? "A":(a>=80?"B":(a>=70?"C":(a>=60?"D":"F")));
        System.out.println(grade);


    }
}

//Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//
//A: 90-100
//
//B: 80-89
//
//C: 70-79
//
//D: 60-69
//
//F: 0-59