import java.util.Scanner;

public class Lect107temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}
