import java.util.Scanner;

public class Diskon {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Total Pembelian: ");
        Double totalBeli = scan.nextDouble();
        if(totalBeli < 0) System.out.println("Mohon Masukkan Total Pembelian Yang Valid!");
        else if(totalBeli < 50000) System.out.println("Total Tagihan: " +totalBeli);
        else if(totalBeli < 75001) {
            System.out.println("Anda Mendapatkan Diskon 5%");
            System.out.println("Total Tagihan Anda: " +totalBeli*0.95);
        }
        else if(totalBeli < 125001){
            System.out.println("Anda Mendapatkan Diskon 15%");
            System.out.println("Total Tagihan Anda: " +totalBeli*0.85);
        }
        else{
            System.out.println("Anda Mendapatkan Diskon 20%");
            System.out.println("Total Tagihan Anda: " +totalBeli*0.80);
        }
    }
}