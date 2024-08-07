public class Lect106 {
    public static void main(String[] args) {
        byte a = 43;
        byte b = 32;
        byte c = 100;
        int d = a*b/c;
        System.out.println(d);
        //this is type promotion automatically java promoted the bytes to integer as at a certain it exceeded the max byte value which is 256


        int number = 'A';
        System.out.println(number);


        byte z = 42;
        short s = 1024;
        char x = 'a';
        int i = 5000;
        float f = 5.32f;
        double j = 0.21334;
        double result = (f*z)+(i/x)+(j*s);
        System.out.println((f*z) + "  " + (i/x)+ "  " + (j*s));
        System.out.println(result);


    }
}