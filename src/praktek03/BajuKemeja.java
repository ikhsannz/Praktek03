
package praktek03;


public class BajuKemeja extends Baju {
    private String jenisBaju;
    private String motifBaju;
    
    void throttle(){
        System.out.println("Ini baju HEM!!!");
    }

    public String getJenisBaju() {
        return jenisBaju;
    }

    public void setJenisBaju(String jenisBaju) {
        this.jenisBaju = jenisBaju;
        
    }

    public String getMotifBaju() {
        return motifBaju;
    }

    public void setMotifBaju(String motifBaju) {
        this.motifBaju = motifBaju;
    }
    
    
}
