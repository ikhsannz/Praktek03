
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
    }
}
