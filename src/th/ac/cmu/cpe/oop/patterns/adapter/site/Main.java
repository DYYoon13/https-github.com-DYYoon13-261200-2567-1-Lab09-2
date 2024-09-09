package th.ac.cmu.cpe.oop.patterns.adapter.site;
import th.ac.cmu.cpe.oop.patterns.adapter.xpay.Xpay;
import th.ac.cmu.cpe.oop.patterns.adapter.payd.payD;

public class Main {
    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Somchai Jaidee");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);
        payD payDD = new XpaytoPayDAdapter(xpay);

        System.out.println(payDD.getCreditCardNo());
        System.out.println(payDD.getCardOwnerName());
        System.out.println(payDD.getCardExpMonth());
        System.out.println(payDD.getCardExpYear());
        System.out.println(payDD.getCardCVVNo());
        System.out.println(payDD.getAmount());
    }
}