package Java_Practice;

import java.util.Scanner;

public class Lab012_Take_User_Input_Find_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter the number: ");
        int num = sc.nextInt();

        //Ternary operator
        String result = (num%2==0)?"The number is even":"The number is odd";
        System.out.println("The entered number is "+result);

        System.out.println("Please inter the number: ");
        int num2 = sc.nextInt();
        if(num2%2==0){
            System.out.println("The num2 is even");
        }else {
            System.out.println("The num2 is odd");
        }
    }
}
