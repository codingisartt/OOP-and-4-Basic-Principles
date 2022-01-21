
public class OgretimGorevlisi extends Akademisyen{
    private String kapiNo;
    //must be like Akademisyen contructor
    public OgretimGorevlisi(String adSoyad, String telefon, String eposta,String bolum, String unvan,String kapiNo){
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo=kapiNo;
    }
    public String getKapiNo(){
        return kapiNo;
    }
    public void setKapiNo(String kapiNo){
        this.kapiNo=kapiNo;
    }
    public void senatoToplanti(){
        System.out.println(this.getAdSoyad()+" senato toplantısına katıldı.");
    }
    public void sinavYap(){
        System.out.println(this.getAdSoyad()+" sınav yaptı.");
    }

    
}