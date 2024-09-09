package th.ac.cmu.cpe.oop.patterns.adapter.site;

import th.ac.cmu.cpe.oop.patterns.adapter.xpay.Xpay;

public class XpayImpl implements Xpay {
    private String cardNumber;
    private String customerName;
    private String expM;
    private String expY;
    private short ccv;
    private double amount;


    @Override
    public String getCreditCardNo() {
        return cardNumber;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String getCardExpMonth() {
        return expM;
    }

    @Override
    public String getCardExpYear() {
        return expY;
    }

    @Override
    public Short getCardCVVNo() {
        return ccv;
    }

    @Override
    public Double getAmount() {
        return amount;
    }


    @Override
    public void setCreditCardNo(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setCardExpMonth(String expM) {
        this.expM = expM;
    }

    @Override
    public void setCardExpYear(String expY) {
        this.expY = expY;
    }

    @Override
    public void setCardCVVNo(Short ccv) {
        this.ccv = ccv;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
