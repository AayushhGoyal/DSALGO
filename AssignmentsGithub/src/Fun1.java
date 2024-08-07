package AssignmentsGithub.src;

import java.util.Scanner;

public class Fun1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        compare(num1, num2, num3);
    }
    public static void compare(int num1, int num2, int num3){
        if(num1 > num3 && num1 > num2){
            System.out.println(num1 + " is greatest");
        }
        else if(num2> num3 && num2 > num1){
            System.out.println(num2 + " is greatest");
        }
        else {
            System.out.println(num3 + " is greatest");
        }

    }
}

