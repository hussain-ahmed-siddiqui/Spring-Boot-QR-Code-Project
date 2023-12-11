package com.cloudassest.intern.qr_code_decoder;

import java.util.LinkedHashMap;
import java.util.Map;

public class QRCodeP2P {
    public QRCodeP2P(Map<Integer,String> foundTags){
        this.qrFormat="P2P";
        this.Payload_Format_Indicator=foundTags.get(0);
        this.Point_of_Initiation_Method=foundTags.get(1);
        this.Scheme_Identifier=foundTags.get(2);
        this.FIName=foundTags.get(3);
        this.IBAN=foundTags.get(4);
        this.Amount=foundTags.get(5);
        this.Reserved_For_Future_Use=foundTags.get(7);
        if(this.Reserved_For_Future_Use==null){
            this.Reserved_For_Future_Use=foundTags.get(8);
            if(this.Reserved_For_Future_Use==null){
                this.Reserved_For_Future_Use=foundTags.get(9);
            }
        }
        this.CRC=foundTags.get(10);

    }
    private String id;

    private String qrFormat;
    private String Payload_Format_Indicator;
    private String Point_of_Initiation_Method;
    private String Scheme_Identifier;
    private String FIName;
    private String IBAN;
    private String Amount;
    private String Reserved_For_Future_Use;
    private String CRC;


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

    public String getScheme_Identifier() {
        return Scheme_Identifier;
    }

    public void setScheme_Identifier(String scheme_Identifier) {
        Scheme_Identifier = scheme_Identifier;
    }

    public String getFIName() {
        return FIName;
    }

    public void setFIName(String FIName) {
        this.FIName = FIName;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }


    public String getReserved_For_Future_Use() {
        return Reserved_For_Future_Use;
    }

    public void setReserved_For_Future_Use(String reserved_For_Future_Use) {
        Reserved_For_Future_Use = reserved_For_Future_Use;
    }

    public String getCRC() {
        return CRC;
    }

    public void setCRC(String CRC) {
        this.CRC = CRC;
    }
}
