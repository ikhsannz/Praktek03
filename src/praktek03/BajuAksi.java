
package praktek03;


public class BajuAksi {
    public static void main(String[] args) {
        Baju a = new Baju();
 
        a.setMerk("cresida");
        a.setWarna("biru");
        a.setUkuran("M");
        a.setHarga(50000);
        
        a.cetakInfo();
        
        System.out.print("Merknya \t:");
        System.out.println(a.getMerk());
        System.out.print("Warnanya \t:");
        System.out.println(a.getWarna());
        System.out.print("Ukurannya \t:");
        System.out.println(a.getUkuran());
        System.out.print("Harganya \t:");
        System.out.println(a.getHarga());
        
        BajuKemeja b = new BajuKemeja();
        b.setMerk("61");
        b.setWarna("Merah");
        b.setUkuran("L");
        b.setHarga(100000);
        b.setJenisBaju("Kotak - Kotak");
        b.cetakInfo();
        System.out.println("Jenis\t: "+b.getJenisBaju());
        b.throttle();
    }
}
