
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
        b.setJenisBaju("Lengan Pendek");
        b.setMotifBaju("Batik");
        b.cetakInfo();
        System.out.println("Jenis\t: "+b.getJenisBaju());
        System.out.println("Motif\t: "+b.getMotifBaju());
        b.throttle();
        
        BajuKoko c = new BajuKoko();
        c.setMerk("Az-zahra");
        c.setWarna("Putih");
        c.setUkuran("S");
        c.setHarga(120000);
        c.setJenisBaju("Gamis");
        c.setModelBaju("Lengan Pendek Tanpa Kancing");
        c.setMotifBaju("Kembang");
        c.cetakInfo();
        System.out.println("Jenis\t: "+c.getJenisBaju());
        System.out.println("Model\t: "+c.getModelBaju());
        System.out.println("Motif\t: "+c.getMotifBaju()); 
        c.throttle();
        
        BajuSekolah d = new BajuSekolah();
        d.setMerk("Barang Haja");
        d.setWarna("Coklat");
        d.setUkuran("S");
        d.setHarga(45000);
        d.setJenisBaju("Pramuka");
        d.setModelBaju("Sekolah SMP");
        d.setMotifBaju("Polos");
        d.cetakInfo();
        System.out.println("Jenis\t: "+d.getJenisBaju());
        System.out.println("Model\t: "+d.getModelBaju());
        System.out.println("Motif\t: "+d.getMotifBaju());
        d.throttle();
    }
}
