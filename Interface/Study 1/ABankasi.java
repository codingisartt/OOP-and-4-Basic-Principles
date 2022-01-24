public class ABankasi implements IBanka,IYeni{

    private String bankaAdi;
    private String terminalId;
    private String password;

    public ABankasi(String bankaAdi, String terminalId, String password){
        this.terminalId=terminalId;
        this.bankaAdi=bankaAdi;
        this.password=password;
    }
    //like interface must be
    @Override
    public boolean connect(String ipAddress){ //boolean must be.
        System.out.println("Kullanıcı ip: " + ipAddress);
        System.out.println("Makina ip : " +this.hostIpAddress);
        System.out.println(this.bankaAdi + " Bağlanıldı.");
        return true;
    }
    @Override
    public boolean payment(double price, double cardNumber, double expiryDate, double cvc){
        System.out.println("Bankadan cevap bekleniyor...");
        System.out.println("İşlem başarılı oldu !");
        return true;
    }

    public String getBankaAdi(){
        return bankaAdi;
    }
    public void setBankaAdi(String bankaAdi){
        this.bankaAdi=bankaAdi;
    }
    public String getTerminalId(){
        return terminalId;
    }
    public void setTerminalId(String terminalId){
        this.terminalId=terminalId;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
}