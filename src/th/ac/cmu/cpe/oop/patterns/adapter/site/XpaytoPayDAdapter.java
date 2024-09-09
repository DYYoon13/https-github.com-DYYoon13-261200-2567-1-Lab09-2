package th.ac.cmu.cpe.oop.patterns.adapter.site;
import th.ac.cmu.cpe.oop.patterns.adapter.payd.payD;
import th.ac.cmu.cpe.oop.patterns.adapter.xpay.Xpay;

public class XpaytoPayDAdapter implements payD {
    private Xpay xpay;

    public XpaytoPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
    }

    public void XpayToPayDAdapter(Xpay xpay){
        this.xpay = xpay;
    }

    @Override
    public long getCreditCardNo() {
        return Long.parseLong(xpay.getCreditCardNo());
    }

    @Override
    public String getCardOwnerName() {
        return xpay.getCustomerName();
    }

    @Override
    public String getCardExpMonth() {
        return xpay.getCardExpMonth();
    }

    @Override
    public String getCardExpYear() {
        return xpay.getCardExpYear();
    }

    @Override
    public Short getCardCVVNo() {
        return xpay.getCardCVVNo();
    }

    @Override
    public Double getAmount() {
        return xpay.getAmount();
    }

    @Override
    public void setCreditCardNo(long creditCardNo) {
        xpay.setCreditCardNo(String.valueOf(creditCardNo));

    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        xpay.setCustomerName(cardOwnerName);
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        xpay.setCardExpMonth(cardExpMonth);
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        xpay.setCardExpYear(cardExpYear);
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        xpay.setCardCVVNo(cardCVVNo);
    }

    @Override
    public void setAmount(Double amount) {
        xpay.setAmount(amount);
    }
}
