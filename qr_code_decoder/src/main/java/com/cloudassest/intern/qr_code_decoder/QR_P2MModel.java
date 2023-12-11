package com.cloudassest.intern.qr_code_decoder;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class QR_P2MModel {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QRCodeP2M getData() {
        return data;
    }

    public void setData(QRCodeP2M data) {
        this.data = data;
    }

    private QRCodeP2M data;
    public QR_P2MModel() {
    }
    public QR_P2MModel(QRCodeP2M qrCodeP2M) {
        this.data=qrCodeP2M;
    }
}
