package Java_Practice;

public class Lab009_In_De_Operator {
    public static void main(String[] args){
        int a = 10;
        System.out.println(++a + a++ + a++); //11+11+12 = 34
        System.out.println(a); //13

        int b = 20;
        System.out.println(--b + b++ + b--); //19+19+20=58
    }
}
