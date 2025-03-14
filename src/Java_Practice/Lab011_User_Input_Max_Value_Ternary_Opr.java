package Java_Practice;

public class Lab011_User_Input_Max_Value_Ternary_Opr {
    public static void main(String[] args){
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        String max_num = n1>n2?"n1 is the max num"+n1:"n2 is the max num"+n2;
        System.out.println(max_num);

    }
}
