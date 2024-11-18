public class TipeDataArray {
    public static void main(String[] args) {
        // Tipe Data Array
        /*
        Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
        Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
         */

        String[] arrayString;

        arrayString = new String[3];
        arrayString[0] = "Banana";
        arrayString[1] = "Joe";
        arrayString[2] = "Apple";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[1] = "Ann";

        System.out.println(arrayString[1]);

        // Array Initializer
        int[] arrayInt = new int[]{
                10,20,30,40,50
        };
        long[] arrayLong = {
                10,20L,30,40,50
        };

        // Operasi di Array
        arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);

        arrayLong[1] = 0;
        System.out.println(arrayLong.length);

        // Array didalam Array
        String[][] members = {
                {"Apel", "Anggur", "Jeruk"},
                {"Pulpen", "Buku", "Rautan"},
                {"Arda", "Niko"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
        System.out.println(members[0]);

    }
}
