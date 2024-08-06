import com.sun.security.jgss.GSSUtil;

public class BitManipulation {
    public static void main(String[] args) {


//        Get bit
//        int n = 5;
//        int pos = 2;
//        int bitmask = 1<<pos;
//        System.out.println(bitmask);
//
//        if((bitmask & n) == 0)
//            System.out.println("Bit was 0");
//        else
//            System.out.println("Bit was 1");
//
//        System.out.println((bitmask & n));

////        Setbit
//        int n = 5;
//        int pos = 1;
//        int bitmask = 1<<pos;
//        System.out.println(bitmask);
//        System.out.println((bitmask | n));

//          Clear Bit
//        int n = 5;
//        int pos = 2;
//        int bitmask = 1<<pos;
//        System.out.println(bitmask);
//
//        int notBitMask = ~bitmask;
//        System.out.println(notBitMask);
//        int newNumber = bitmask & notBitMask;
//
//        System.out.println(newNumber);


//        UpdateBit
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        int setOperation = bitMask | n;
        System.out.println(setOperation);

//            int n = 5;
//            int pos = 2;
//            int bitMask = 1<<pos;
//            int notBitMask = ~bitMask;
//
//            int clearOperation = notBitMask & n;
//            System.out.println(clearOperation);

    }
}
