package ex_01_Java_Basic;

import java.sql.SQLOutput;

public class Lab007_OperatorsAndMathFunction {
    public static void main(String[] ags){
        char a = 'A';
        char b = 'B';
        String s= "a";
        System.out.println(a);
        System.out.println(a+s);
        System.out.println(a+b);

        int x=10, y=10,z=10;

        double k = Math.cbrt((Math.pow(x,2)+Math.pow(y,2))-Math.abs(z));
        System.out.println(k);


    }
}
