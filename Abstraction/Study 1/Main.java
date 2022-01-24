public class Main { //
    public static void main(String[] args) {
        Calisan c1=new Calisan("Tubanur Balci", "55555555", "tuba@gmail.com");
        c1.giris();
        // Object can not be created from abstract class
        //Akademisyen a1=new Akademisyen("Patika Dev", "3333333", "patika@dev.com","CENG","Doçent");
        //a1.cikis();
        //a1.derseGir();

        /*Calisan m1=new Memur("Ali Veli", "8888888", "memur@gmail.com", "Bilgi İşlem", "09:00-18:00");
        m1.cikis(); //m1.calis() do not run, because the method from Memur class.
        Memur m2=new Memur("Ali Veli", "8888888", "memur@gmail.com", "Bilgi İşlem", "09:00-18:00");
        m2.calis();*/
    
        OgretimGorevlisi o1=new OgretimGorevlisi("Ayşegül Balci", "3333333", "aysegul@gmail.com", "MED", "Profesör", "445");
        o1.giris();
        o1.derseGir("10:00");
        System.out.println(o1.getKapiNo());
        

    }
}
