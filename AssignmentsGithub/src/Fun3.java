package AssignmentsGithub.src;

import java.util.Scanner;

// checking if the person is eligible to vote or not
public class Fun3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        canVote(age);

    }

    public static void canVote(int age){
        if (age >= 18){
            System.out.println("you can vote");
        }
        else {
            System.out.println("you cant vote");
        }
    }
}
