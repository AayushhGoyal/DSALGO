import java.util.Scanner;

public class Lect103 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your roll no.");
        int rollno = input.nextInt();
        System.out.println("Your roll no is: " + rollno);
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}

