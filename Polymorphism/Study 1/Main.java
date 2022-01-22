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

        Calisan a2=new Akademisyen("Kodluyoruz Balci", "666666", "kod@gmail.com", "CENG", "Profesör");
        a2.giris(); //from Akademisyen, we can attain because this is override method 
        a2.yemekhane(); //from calisan class

        //int[] loginUser=new int[5];
        
        //Akademisyen[] loginUser={c1,a1,a2}; just allows for a1 object
        Calisan[] loginUser={c1,a1,a2};   
        Calisan.girisYapanlar(loginUser);//static methods can be called from the class
    }
}
