// Nama : Gita Bangun Prakoso
// NIM  : M0521024

import java.util.Scanner;

public class PPBO_04_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}

/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB :
 - Tidak
 - Exception in thread "main" java.util.InputMismatchException 
 - Input tidak sesuai dengan  yang diminta (hanya meminta input berupa int)

*/

/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB :
 - 5 / 0 = Infinity
 - karena variabel hasil memiliki tipe data double (bisa dibagi dengan 0) dan menghasilkan jawaban infinity (tidak menimbulkan eror)
*/