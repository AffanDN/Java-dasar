public class Variable {
    public static void main(String[] args) {
        // Variable adalah tempat untuk menyimpan data
        /*
            Java adalah bahasa static type, sehingga sebuah variable hanya bisa digunakan
            untuk menyimpan tipe data yang sama, tidak bisa berubah-ubah tipe data seperti di bahasa pemrograman PHP
            atau JavaScript
        */
        // Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variable nya
        // Nama variable tidak boleh mengandung whitespace dan tidak boleh seluruhnya Number

        String name;
        name = "Banana Joe";

        int age = 30;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // Kata Kunci Var
        /*
        Sejak Versi Java 10, Java mendukung pembuatan variabel dengan kata kunci var,
        sehingga kita tidak perlu menyebtukan tipe datanya

        Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat sebuah variable, kita
        harus menginisialisasi value / nilai dari variable tersebut secara langsung
        */

        //var name1; // error
        var name1 = "Banana Ja";

        var age1 = 30;
        var address1 = "Singapore";

        System.out.println(name1);
        System.out.println(age1);
        System.out.println(address1);

        // Kata Kunci Final
        /*
        Secara default, variable di Java bisa diubah-ubah nilainya

        Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali
        dibuat, kita bisa menggunakan kata kunci final

        Istilah variabel seperti ini, banyak juga yang menyebutnya konstan
         */

        // final String nameChanged = "Apple Pie";
        var age2 = 21;
        var address2 = "Germany";

        var nameChanged = "Nama Diubah"; // error

        System.out.println(nameChanged);
        System.out.println(age);
        System.out.println(address);
    }
}
