package th.ac.cmu.cpe.oop.patterns.adapter.payd;

public interface payD {
    public long getCreditCardNo();
    public String getCardOwnerName();
    public String getCardExpMonth();
    public String getCardExpYear();
    public Short getCardCVVNo();
    public Double getAmount();

    public void setCreditCardNo(long creditCardNo);
    public void setCardOwnerName(String cardOwnerName);
    public void setCardExpMonth(String cardExpMonth);
    public void setCardExpYear(String cardExpYear);
    public void setCardCVVNo(Short cardCVVNo);
    public void setAmount(Double amount);

}
