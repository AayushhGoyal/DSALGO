package AssignmentsGithub.src;

import java.util.Scanner;

public class Fun4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = sum(num1, num2);
        System.out.println(ans);

    }
    public static int sum(int a, int b){
        int add = a + b;
        return add;
    }
}
