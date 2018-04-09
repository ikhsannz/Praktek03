
package praktek03;


public class BajuSekolah extends Baju{
   private String jenisBaju;
   private String modelBaju;
   
   void throttle(){
        System.out.println("Ini baju Sekolah Tauk!!!");
}

    public String getJenisBaju() {
        return jenisBaju;
    }

    public void setJenisBaju(String jenisBaju) {
        this.jenisBaju = jenisBaju;
    }

    public String getModelBaju() {
        return modelBaju;
    }

    public void setModelBaju(String modelBaju) {
        this.modelBaju = modelBaju;
    }
   
   
}
