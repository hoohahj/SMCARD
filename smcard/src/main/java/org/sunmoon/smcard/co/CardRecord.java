package org.sunmoon.smcard.co;

import java.io.Serializable;

public class CardRecord implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String no;
    private String cardNo;
    private String businessRegistNo;
    private String paymentDate;
    private String amount;

    private int itemStart;
    private int itemSizePerPage;

    public CardRecord() {
    }

    public CardRecord(String no, String cardNo, String businessRegistNo, String paymentDate, String amount, int itemStart, int itemSizePerPage) {
        this.no = no;
        this.cardNo = cardNo;
        this.businessRegistNo = businessRegistNo;
        this.paymentDate = paymentDate;
        this.amount = amount;

        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return this.no;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setBusinessRegistNo(String businessRegistNo) {
        this.businessRegistNo = businessRegistNo;
    }

    public String getBusinessRegistNo() {
        return this.businessRegistNo;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentDate() {
        return this.paymentDate;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setItemStart(int itemStart) {
        this.itemStart = itemStart;
    }

    public int getItemStart() {
        return this.itemStart;
    }

    public void setItemSizePerPage(int itemSizePerPage) {
        this.itemSizePerPage = itemSizePerPage;
    }

    public int getItemSizePerPage() {
        return this.itemSizePerPage;
    }
}
