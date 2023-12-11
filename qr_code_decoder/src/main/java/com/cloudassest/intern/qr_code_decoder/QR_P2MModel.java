package com.cloudassest.intern.qr_code_decoder;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class QR_P2MModel {
    @Id
    private String id;
    private QRCodeP2M data;

}
