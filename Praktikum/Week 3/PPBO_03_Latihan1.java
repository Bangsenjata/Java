// Nama : Gita Bangun Prakoso
// NIM  : M0521024

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total pembelian : ");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        double totalPembelian = sc.nextDouble();
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan
        if(totalPembelian < 50000 & totalPembelian > 0){
            System.out.println("Diskon anda 0% yaitu: " +(totalPembelian - totalPembelian));
            System.out.println("Harga setelah diskon: " +totalPembelian);
        }
        else if(totalPembelian <= 75000 & totalPembelian >=50000){
            System.out.println("Diskon anda 5% yaitu: " +(totalPembelian - (totalPembelian*0.95)));
            System.out.println("Harga setelah diskon: " +totalPembelian*0.95);
        }
        else if(totalPembelian <=125000 & totalPembelian >=75000){
            System.out.println("Diskon anda 15% yaitu: " +(totalPembelian - (totalPembelian*0.85)));
            System.out.println("Harga setelah diskon: " +totalPembelian*0.85);
        }
        else if(totalPembelian > 125000){
            System.out.println("Diskon anda 20% yaitu: " +(totalPembelian - (totalPembelian*0.8)));
            System.out.println("Harga setelah diskon: " +totalPembelian*0.80);
        }
        else{
            System.out.println("Mohon masukkan nominal pembayaran yang valid!");
        }

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000