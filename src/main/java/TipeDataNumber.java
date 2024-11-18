public class TipeDataNumber {
    public static void main(String[] args) {
        // Integer Number
        byte iniByte = 100; //byte => -128 - 127
        short iniShort = 1000;
        int iniInteger = 10000000;
        long inilong = 1000000000;
        long inilong2 = 1000000000L;

        // Floating Point Number
        float iniFloat = 10.12F;
        double iniDouble = 10.10;

        // Literals
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        // Underscore : untuk memudahkan dalam pembacaan angka
        long balance = 1_000_000_000_000L;

        // Konversi Tipe Data Number
        // Widening Casting (Otomatis): byte -> short -> int -> long -> float -> double
        byte iniByte2 = 10; //byte => -128 - 127
        short iniShort2 = iniByte2;
        int iniInteger2 = iniShort2;
        long inilong3 = iniInteger2;
        long inilong31 = inilong3;

        // Narrowing Casting (Manual) double -> float -> long -> int -> short -> byte
        int iniInt = 1000;
        byte iniByte3 = (byte) iniInt;

    }
}
