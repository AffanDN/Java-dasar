import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        // Expression
        /*
        Expression adalah konstruksi dari variabel, operator, dan pemanggilan method yang mengevaluasi
        menjadi sebuah single value
        Expression adalah core component dari statement
         */

        int value; // Expression
        value = 10; // Expression

        System.out.println(value = 100);
        // Expression => kalimat kecilnya value = 100
        // Statement => dari ujung kiri sampai kanan

        // Statement
        /*
        Statement bisa dibilang adalah kalimat lengkap dalam bahasa
        Sebuah statement beerisikan execution komplit, biasanya diakhiri dengan titik koma
        Ada beberapa jenis statement:
        - Assignment expression
        - Penggunaan ++ dan --
        - Method Invocation
        - Object Creation Expression
         */

        // Assignment Statement
        double aValue = 8933.234;

        // Increment statement
        aValue++;

        // Method Invocation Statement
        System.out.println("Hello World!");

        // Object Creation Statement
        Date date = new Date();

        // Block
        /*
        Block adalah kumpulan statement yang terdiri dari nol atau lebih statement
        Block diawali dan diakhiri dengan kurung kurawal {}
         */
        {
            System.out.println("Hello World 1 !");
            System.out.println("Hello World 2 !");
            System.out.println("Hello World 3 !");

            {
                System.out.println("    Hello World 1-1 !");
                System.out.println("    Hello World 2-2 !");
                System.out.println("    Hello World 3-3 !");
            }
        }
    }
}
