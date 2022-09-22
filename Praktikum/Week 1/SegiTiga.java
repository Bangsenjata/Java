public class SegiTiga{
    int alas = 3;
    int tinggi = 4;
    int sisiMiring = 5;

    public double hitungLuas(){
        double luas = 0.5 *this.alas *this.tinggi;
        return luas;
    }

    public static void main(String[] args){
        SegiTiga segiTiga = new SegiTiga();
        System.out.println("Alas: " +segiTiga.alas);
        System.out.println("Tinggi: "+segiTiga.tinggi);
        System.out.println("Sisi Miring: " +segiTiga.sisiMiring);
        System.out.println("Luas Segitiga: " +segiTiga.hitungLuas());
    }
}