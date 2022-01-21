public class Main {
    public static void main(String[] args) {
        Calisan c1=new Calisan("Tubanur Balci", "55555555", "tuba@gmail.com");
        c1.giris();
        Akademisyen a1=new Akademisyen("Patika Dev", "3333333", "patika@dev.com","CENG","Doçent");
        a1.cikis();
        a1.derseGir();

        Calisan m1=new Memur("Ali Veli", "8888888", "memur@gmail.com", "Bilgi İşlem", "09:00-18:00");
        m1.cikis(); //m1.calis() do not run, because the method from Memur class.
        Memur m2=new Memur("Ali Veli", "8888888", "memur@gmail.com", "Bilgi İşlem", "09:00-18:00");
        m2.calis();
    
        OgretimGorevlisi o1=new OgretimGorevlisi("Ayşegül Balci", "3333333", "aysegul@gmail.com", "MED", "Profesör", "445");
        o1.giris();
        o1.derseGir();
        System.out.println(o1.getKapiNo());

        Asistan as1=new Asistan("Asistan Balci", "7777777", "asistan@gmail.com", "CENG", "Araştırma Görevlisi", "09:00-18:00");
        as1.quizYap();

        LabAsistani lb1=new LabAsistani("Lab Asistanı Balci", "999999", "lab@gmail.com", "CENG", "Araştırma Görevlisi", "09:00-18:00");
        lb1.derseGir();

        BilgiIslem bis1=new BilgiIslem("Bilgi İşlem Balci", "22222", "2222222", "EEE", "18:00-20:00", "Raporlama");
        bis1.networkKurulum();
        bis1.yemekhane();

        GuvenlikGorevlisi gv1=new GuvenlikGorevlisi("Güvenlik Balci", "000000", "guvenlik@gmail.com", "Güvenlik", "18:00-20:00", "Güvenlik Belgesi");
        gv1.nobet();
        

    }
}
