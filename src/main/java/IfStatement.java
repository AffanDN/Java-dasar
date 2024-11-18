public class IfStatement {
    public static void main(String[] args) {
        // IF Statement
        /*
        Dalam Java, if adaah salah satu kunci yang digunakan untuk percabangan
        Percabangan artina kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
        Hampir di semua bahasa pemrograman mendukung if expression
         */

        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("==== Anda Lulus ====");
        }

        // Else Statement
        /*
        Blok If akan dieksekusi ketika kondisi if bernilai true
        Ketika ingin melakukan eksekusi program yang menghasilkannilai false
        maka dapat menggunakan else expression
         */

        if (nilai >= 75 && absen >= 75) {
            System.out.println("TRUE ==== Anda Lulus ====");
        } else {
            System.out.println("FALSE === Silahkan Coba lagi Tahun Depan ===");
        }

        // Else If Statement
        /*
        Dalam case tertentu, kita mebutuhkan beberapa kondisi
        Case seperti ini dapat menggunakan Else if expression
        Else if di java dapat lebih dari 1
         */

        if (nilai >= 80 && absen >= 80) {
            System.out.println(" --- Nilai anda A ---");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println(" --- Nilai anda B ---");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println(" --- Nilai anda C ---");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println(" --- Nilai anda D ---");
        } else {
            System.out.println(" --- Nilai anda E ---");
        }
    }
}
