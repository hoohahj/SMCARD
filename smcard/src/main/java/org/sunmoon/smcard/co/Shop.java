package org.sunmoon.smcard.co;

import java.io.Serializable;
import java.util.List;

public class Shop implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String businessRegistNo;
    private String shopName;
    private String address;
    private String detailAddress;
    private String zipCode;
    
    private List<Count> visitCount;

    private int itemStart;
    private int itemSizePerPage;

    public Shop() {
    }

	public Shop(String businessRegistNo, String shopName, String address, String detailAddress, String zipCode,
			List<Count> visitCount, int itemStart, int itemSizePerPage) {
		super();
		this.businessRegistNo = businessRegistNo;
		this.shopName = shopName;
		this.address = address;
		this.detailAddress = detailAddress;
		this.zipCode = zipCode;
		this.visitCount = visitCount;
		this.itemStart = itemStart;
		this.itemSizePerPage = itemSizePerPage;
	}

	public String getBusinessRegistNo() {
		return businessRegistNo;
	}

	public void setBusinessRegistNo(String businessRegistNo) {
		this.businessRegistNo = businessRegistNo;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public List<Count> getVisitCount() {
		return visitCount;
	}

	public void setVisitCount(List<Count> visitCount) {
		this.visitCount = visitCount;
	}

	public int getItemStart() {
		return itemStart;
	}

	public void setItemStart(int itemStart) {
		this.itemStart = itemStart;
	}

	public int getItemSizePerPage() {
		return itemSizePerPage;
	}

	public void setItemSizePerPage(int itemSizePerPage) {
		this.itemSizePerPage = itemSizePerPage;
	}
}
