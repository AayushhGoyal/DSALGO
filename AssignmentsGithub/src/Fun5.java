package AssignmentsGithub.src;

import java.util.Scanner;

public class Fun5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(mul(a,b));
    }

    public static int mul(int num1, int num2){
        int mul = num1*num2;
        return mul;
    }
}
