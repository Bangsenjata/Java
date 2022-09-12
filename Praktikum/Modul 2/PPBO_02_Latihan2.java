// Nama : Gita Bangun Prakoso
// NIM  : M0521024
public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}
// Apa yang salah dengan source code tersebut?
// Jawaban : pendeklarasian final pada variabel KURS_DOLLAR menyebabkan nilainya terkunci atau tidak bisa diubah (pendeklrasian final mengunci nilai dari variabel tersebut)
//           Solusi yang saya pikirkan ada 2 yaitu: 
//           1. Menghapus final saat mendeklarasikan variabel KURS_DOLLAR
//           2. Menghapus perubahan nilai (Menghapus line 8 atau membuatnya menjadi komentar)
// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban : Supaya bisa mendeklrasikan variabel diluar objek dan menyimpan nilai walau beda objek
