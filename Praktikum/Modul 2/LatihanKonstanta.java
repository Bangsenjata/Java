public class LatihanKonstanta {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
    //KURS_DOLLAR = 13500;
    System.out.println(KURS_DOLLAR);
    System.out.println(PI);
    System.out.println(NAMA);
    }
}
/* 
 1. Error disebabkan oleh final yang dideklarasikan pada variabel KURS_DOLLAR yang artinya nilai dalam variabel tersebut tidak dapat diganti
    setelahnya ada kode yang mencoba mengganti nilai dari kurs dollar, maka dari itu terjadilah error
 2. Static pada saat pendeklarasian digunakan agar dapat melakukan pendeklarasian diluar object pada class "LatihanKonstanta"
*/