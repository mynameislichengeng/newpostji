package com.example.myapplication;

import java.util.List;

public class ThirdPartyRegisterRequest {

    private String registrationType;

    private String thirdPartyEventType;

    private List<String> transactionsSupported;

    private String thirdPartyPackage;

    private String thirdPartyReceiver;

    private String thirdPartyAction;

    private String buttonTextEn;

    private String buttonTextFr;

    private String buttonTextSp;

    public String getRegistrationType() {
        return registrationType;
    }

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }

    public String getThirdPartyEventType() {
        return thirdPartyEventType;
    }

    public void setThirdPartyEventType(String thirdPartyEventType) {
        this.thirdPartyEventType = thirdPartyEventType;
    }

    public List<String> getTransactionsSupported() {
        return transactionsSupported;
    }

    public void setTransactionsSupported(List<String> transactionsSupported) {
        this.transactionsSupported = transactionsSupported;
    }

    public String getThirdPartyPackage() {
        return thirdPartyPackage;
    }

    public void setThirdPartyPackage(String thirdPartyPackage) {
        this.thirdPartyPackage = thirdPartyPackage;
    }

    public String getThirdPartyReceiver() {
        return thirdPartyReceiver;
    }

    public void setThirdPartyReceiver(String thirdPartyReceiver) {
        this.thirdPartyReceiver = thirdPartyReceiver;
    }

    public String getThirdPartyAction() {
        return thirdPartyAction;
    }

    public void setThirdPartyAction(String thirdPartyAction) {
        this.thirdPartyAction = thirdPartyAction;
    }

    public String getButtonTextEn() {
        return buttonTextEn;
    }

    public void setButtonTextEn(String buttonTextEn) {
        this.buttonTextEn = buttonTextEn;
    }

    public String getButtonTextFr() {
        return buttonTextFr;
    }

    public void setButtonTextFr(String buttonTextFr) {
        this.buttonTextFr = buttonTextFr;
    }

    public String getButtonTextSp() {
        return buttonTextSp;
    }

    public void setButtonTextSp(String buttonTextSp) {
        this.buttonTextSp = buttonTextSp;
    }
}
