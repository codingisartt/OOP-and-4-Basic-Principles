public class LabAsistani extends Asistan {
    public LabAsistani(String adSoyad, String telefon, String eposta,String bolum, String unvan,String ofisSaati){
        super(adSoyad,telefon,eposta,bolum,unvan,ofisSaati); // first super must be.
        
    }
    public void lablaraGir(){
        System.out.println(this.getAdSoyad()+ " lablara girdi .");
    }
    
}
