// Nama : Gita Bangun Prakoso
// NIM  : M0521024

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        for (int i = 0; i < 5; i++) { //perubahan: mengganti "int i = 1; i < 6" menjadi "int i = 0; i < 5"
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]); //perubahan: mengganti "elemen ke- i" menjadi "elemen ke- (i+1)"
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

/*
Jawab:
Penulisan for tersebut kurang tepat apabila ingin digunakan untuk melakukan loop untuk menampilkan nilai array karena
iterasi loop tersebut seharusnya dimulai dari 0 lalu untuk penulisan saat memberitahukan elemen ke-i seharusnya dituliskan (i+1) apabila iterasi dimulai dari 0
*/