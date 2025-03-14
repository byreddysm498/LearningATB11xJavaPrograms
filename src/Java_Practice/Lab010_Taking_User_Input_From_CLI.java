package Java_Practice;

public class Lab010_Taking_User_Input_From_CLI {
    public static void main(String[] args) {
        String Name= args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);


        System.out.println(Name+" age is "+age+" and his salary is "+salary);

    }
}
