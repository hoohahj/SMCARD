package org.sunmoon.smcard.co;

import java.io.Serializable;

public class AuthInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String authKey;
    private String authStatus;

    private int itemStart;
    private int itemSizePerPage;

    public AuthInfo() {
    }

    public AuthInfo(String authKey, String authStatus, int itemStart, int itemSizePerPage) {
        this.authKey = authKey;
        this.authStatus = authStatus;

        this.itemStart = itemStart;
        this.itemSizePerPage = itemSizePerPage;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public String getAuthKey() {
        return this.authKey;
    }

    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    public String getAuthStatus() {
        return this.authStatus;
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
