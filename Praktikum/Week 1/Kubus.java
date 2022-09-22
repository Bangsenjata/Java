public class Kubus {
    int sisiKubus = 5;

    public Double hitungVolume(){
        Double volume = Math.pow(Double.valueOf(this.sisiKubus), 3);
        return volume;
    }

    public int hitungLuasPermukaan(){
        int luasPermukaan = this.sisiKubus * this.sisiKubus * 6;
        return luasPermukaan;
    }

    public static void main(String[] args){
        Kubus kubus = new Kubus();
        System.out.println("Menghitung Luas dan Volume Kubus");
        System.out.println("Sisi Kubus: " +kubus.sisiKubus);
        System.out.println("Volume: " +kubus.hitungVolume());
        System.out.println("Luas Permukaan: " +kubus.hitungLuasPermukaan());
    }
}