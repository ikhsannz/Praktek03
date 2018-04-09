
package praktek03;

public class Baju {
    private String merk;
    private String warna;
    private String ukuran;
    private double harga;
    
    void cetakInfo() {
        System.out.println("Merk \t:"+merk+"\n"+
                "Warna \t:"+warna+"\n"+
                "Ukuran \t:"+ukuran+"\n"+
                "Harga \t:"+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    
}
