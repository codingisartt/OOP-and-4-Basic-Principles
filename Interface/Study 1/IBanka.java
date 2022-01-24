
public interface IBanka {
    // we can not define variable, if we do not put a value. String str=null; is possible because there is not constructor.
    final String hostIpAddress="127.0.0.1"; //generally final keyword is used.
    boolean connect(String ipAddress);
    boolean payment(double price, double cardNumber, double expiryDate, double cvc);

}