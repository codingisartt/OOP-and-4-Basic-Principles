public class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;
    //constructor must be like Calisan constructor.
    public Akademisyen(String adSoyad, String telefon, String eposta,String bolum, String unvan){
        super(adSoyad,telefon,eposta); // first super must be.
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String getBolum(){
        return bolum;
    }
    public void setBolum(String bolum){
        this.bolum=bolum;
    }
    public String getUnvan(){
        return unvan;
    }
    public void setUnvan(String unvan){
        this.unvan=unvan;
    }
    public void derseGir(){ // this.adSoyad can not be used
        System.out.println(this.getAdSoyad()+" derse giriş yaptı !");
    }

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad()+" A kapısından giriş yaptı.");
    }

}

