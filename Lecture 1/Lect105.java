public class Lect105 {
    public static void main(String[] args) {
        //let's see typecasting and type conversion

        float a = 45;
        System.out.println(a);
        //this will take integer and convert it into float


//        int b = 39.44;
//        System.out.println(b);
        //here this thing will show error as int is smaller than float in comparison so its difficult to convert it straightaway
        // in this case instead we use typecasting

        int v = (int) (432.52f);
        System.out.println(v);

        int check = 264;
        byte b = (byte)(check);
        System.out.println(b);
    }
}
