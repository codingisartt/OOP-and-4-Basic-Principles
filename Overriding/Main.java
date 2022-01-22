public class Main {
    public static void main(String[] args) {
        Calisan c1=new Calisan("Tubanur Balci", "55555555", "tuba@gmail.com");
        c1.giris();
        c1.giris("10:00");
        c1.giris("10:00", "18:00");// overloading
        Akademisyen a1=new Akademisyen("Patika Dev", "3333333", "patika@dev.com","CENG","Doçent");
        a1.cikis();
        a1.derseGir();
        a1.giris(); //from override method

        

    }
}
