public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        // Tipe Data Bukan Primitif
        /*
        Tipe data primitif adalah tipe bawaan didalam bahasa pemrograman.
        Tipe data primitif tidak bisa diubah lagi
        Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value
        Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
        Tipe data bukan primitif bisa memiliki method/function
        Di Java, semua tipe data primiitif memiliki representasi tipe data bukan primitifnya
         */

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        // Konversi dari Tipe Data Primitif menjadi Bukan Primitif

        int iniInt = 100;

        Integer iniInteger2 = iniInt;

        // Contoh Lain jika tipedata nya sama
         int age = 30;

         Integer ageObject = age;

         // Tipedata yang berbeda
        // ex: dari int ke short
         int ageAgain = ageObject;
         short shortAge = ageObject.shortValue();
         byte byteAge = ageObject.byteValue();

         Long amount = 10000000l;

    }
}
