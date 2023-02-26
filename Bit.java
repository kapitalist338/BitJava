public class Bin {
    Bin(){

        int a = 0b1100010;

        System.out.println(a);

        int b = 98;

        System.out.println(Integer.toBinaryString(b));

        //////////////////////////////////////////////

        int x = 0b01011;

        for (int y = 0; y < 5; y++) {

            System.out.println("\n\n" + x);

            System.out.println(Integer.toBinaryString(x));


            System.out.println("\n\n--- BIT-TO-RIGHT "+ y + "---");

            System.out.println("\nIn Decimal: " + (x >> y));

            System.out.println("\nIn Binary: " + binstr(x >> y));


            System.out.println("\n\n--- BIT-TO-LEFT " + y + "---");

            System.out.println("\nIn Decimal: " + (x << y));

            System.out.println("\nIn Binary: " + binstr(x << y));
        }
    }

    public static String binstr(int b){

        return "0b" + Integer.toBinaryString(0b1000000000 | (b & 0xff)).substring(1);

    }
}
