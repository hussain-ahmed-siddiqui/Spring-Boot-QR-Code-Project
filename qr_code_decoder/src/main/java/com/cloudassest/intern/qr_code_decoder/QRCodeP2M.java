package com.cloudassest.intern.qr_code_decoder;

import java.util.Map;

public class QRCodeP2M {

    public QRCodeP2M(Map<Integer,String> foundTags,Map<Integer,String> foundSubTagsMAI,Map<Integer,String> foundSubTagsAdditional){
        this.qrFormat="P2M";
        this.Payload_Format_Indicator=foundTags.get(0);
        this.Point_of_Initiation_Method=foundTags.get(1);
        /*Merchant Account Info */
        if(foundTags.get(2)!=null){this.visa=foundTags.get(2);}
        else{this.visa=foundTags.get(3);}
        if(foundTags.get(4)!=null){this.masterCard=foundTags.get(4);}
        else{this.masterCard=foundTags.get(5);}
        if(foundTags.get(15)!=null){this.unionPay=foundTags.get(15);}
        else{this.unionPay=foundTags.get(16);}
        this.raast[0]=foundSubTagsMAI.get(0);
        this.raast[1]=foundSubTagsMAI.get(1);
        this.merchantCategoryCode=foundTags.get(52);
        this.transactionCurrency=foundTags.get(53);
        this.countryCode=foundTags.get(58);
        this.merchantName=foundTags.get(59);
        this.merchantCity=foundTags.get(60);
        /*AdditionaL data*/

        this.billNumber=foundSubTagsAdditional.get(1);
        this.referenceLabel=foundSubTagsAdditional.get(5);
        this.Cycle_Redundancy_Check=foundTags.get(63);
    }
    private String id;
    private String qrFormat;
    private String Payload_Format_Indicator;
    private String Point_of_Initiation_Method;
    private String [] Merchant_Account_Info;
    private String visa;
    private String masterCard;
    private String unionPay;
    private String [] raast;
    private String merchantCategoryCode;
    private String transactionCurrency;
    private String countryCode;
    private String merchantName;
    private String merchantCity;
    private String [] additionalData;
    private String billNumber;
    private String mobileNumber;
    private String Store_Label;
    private String Loyalty_Number;
    private String referenceLabel;
    private String customerLabel;
    private String terminalLabel;
    private String transactionPurpose;
    private String additionalConsumerData;
    private String merchantTaxId;
    private String merchantChannel;
    private String dueDate;
    private String amountAfterDueDate;
    private String RFU_SBP;
    private String Cycle_Redundancy_Check;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQrFormat() {
        return qrFormat;
    }

    public void setQrFormat(String qrFormat) {
        this.qrFormat = qrFormat;
    }

    public String getPayload_Format_Indicator() {
        return Payload_Format_Indicator;
    }

    public void setPayload_Format_Indicator(String payload_Format_Indicator) {
        Payload_Format_Indicator = payload_Format_Indicator;
    }

    public String getPoint_of_Initiation_Method() {
        return Point_of_Initiation_Method;
    }

    public void setPoint_of_Initiation_Method(String point_of_Initiation_Method) {
        Point_of_Initiation_Method = point_of_Initiation_Method;
    }

    public String[] getMerchant_Account_Info() {
        return Merchant_Account_Info;
    }

    public void setMerchant_Account_Info(String[] merchant_Account_Info) {
        Merchant_Account_Info = merchant_Account_Info;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    public String getMasterCard() {
        return masterCard;
    }

    public void setMasterCard(String masterCard) {
        this.masterCard = masterCard;
    }

    public String getUnionPay() {
        return unionPay;
    }

    public void setUnionPay(String unionPay) {
        this.unionPay = unionPay;
    }

    public String getRaast() {
        return raast;
    }

    public void setRaast(String raast) {
        this.raast = raast;
    }

    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    public String[] getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String[] additionalData) {
        this.additionalData = additionalData;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getStore_Label() {
        return Store_Label;
    }

    public void setStore_Label(String store_Label) {
        Store_Label = store_Label;
    }

    public String getLoyalty_Number() {
        return Loyalty_Number;
    }

    public void setLoyalty_Number(String loyalty_Number) {
        Loyalty_Number = loyalty_Number;
    }

    public String getReferenceLabel() {
        return referenceLabel;
    }

    public void setReferenceLabel(String referenceLabel) {
        this.referenceLabel = referenceLabel;
    }

    public String getCustomerLabel() {
        return customerLabel;
    }

    public void setCustomerLabel(String customerLabel) {
        this.customerLabel = customerLabel;
    }

    public String getTerminalLabel() {
        return terminalLabel;
    }

    public void setTerminalLabel(String terminalLabel) {
        this.terminalLabel = terminalLabel;
    }

    public String getTransactionPurpose() {
        return transactionPurpose;
    }

    public void setTransactionPurpose(String transactionPurpose) {
        this.transactionPurpose = transactionPurpose;
    }

    public String getAdditionalConsumerData() {
        return additionalConsumerData;
    }

    public void setAdditionalConsumerData(String additionalConsumerData) {
        this.additionalConsumerData = additionalConsumerData;
    }

    public String getMerchantTaxId() {
        return merchantTaxId;
    }

    public void setMerchantTaxId(String merchantTaxId) {
        this.merchantTaxId = merchantTaxId;
    }

    public String getMerchantChannel() {
        return merchantChannel;
    }

    public void setMerchantChannel(String merchantChannel) {
        this.merchantChannel = merchantChannel;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getAmountAfterDueDate() {
        return amountAfterDueDate;
    }

    public void setAmountAfterDueDate(String amountAfterDueDate) {
        this.amountAfterDueDate = amountAfterDueDate;
    }

    public String getRFU_SBP() {
        return RFU_SBP;
    }

    public void setRFU_SBP(String RFU_SBP) {
        this.RFU_SBP = RFU_SBP;
    }

    public String getCycle_Redundancy_Check() {
        return Cycle_Redundancy_Check;
    }

    public void setCycle_Redundancy_Check(String cycle_Redundancy_Check) {
        Cycle_Redundancy_Check = cycle_Redundancy_Check;
    }
}
