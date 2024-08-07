package AssignmentsGithub.src;

import java.util.Scanner;

public class Fun2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        check(number);
    }

    public static void check(int num){
        if (num % 2 == 0){
            System.out.println("the entered number is even");
        }
        else{
            System.out.println("the entered number is odd");
        }
    }


}

