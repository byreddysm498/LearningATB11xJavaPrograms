package ex_01_Java_Basic;

public class Lab004_MainMethodOverLoading {
    public static void main(String[] args){
        System.out.println("main method can be overloaded but JVM looks for the parameters with String[] args");

    }

    public static void main(String args) {
        System.out.println("This is another main method but input parameter i String");

    }
}
