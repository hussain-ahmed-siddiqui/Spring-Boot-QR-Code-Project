package com.cloudassest.intern.qr_code_decoder;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class QR_P2PModel {
    @Id
    private String id;
    private QRCodeP2P data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QRCodeP2P getData() {
        return data;
    }

    public void setData(QRCodeP2P data) {
        this.data = data;
    }
    public QR_P2PModel() {
    }
    public QR_P2PModel(QRCodeP2P qrCodeP2P) {
        this.data=qrCodeP2P;
    }
}
