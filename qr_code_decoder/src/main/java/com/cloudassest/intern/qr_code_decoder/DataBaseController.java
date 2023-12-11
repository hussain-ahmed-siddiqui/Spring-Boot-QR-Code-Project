package com.cloudassest.intern.qr_code_decoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DataBaseController {
    @Autowired
    private P2P_Repository p2PRepository;
    @Autowired
    private P2M_Repository p2MRepository;
    private Map<Integer, QRCodeP2P> db1 = new LinkedHashMap<>();
    private Map<Integer, QRCodeP2M> db2 = new LinkedHashMap<>();
    private Integer _id=0;


    public Collection<QRCodeP2P> getP2p(){
        return db1.values();
    }
    public Collection<QRCodeP2M> getP2m(){
        return db2.values();
    }
    public QRCodeP2P saveP2P(String qrString){
        TagParserP2P p2pParser = new TagParserP2P();
        p2pParser.parse(qrString);
        QRCodeP2P qrCodeP2P = new QRCodeP2P(p2pParser.foundTags);
        qrCodeP2P.setId(UUID.randomUUID().toString());
        db1.put(_id++,qrCodeP2P);
        return qrCodeP2P;
    }
    public QRCodeP2M saveP2M(String qrString){
        TagParser p2mParser = new TagParser();
        p2mParser.parseString(qrString);
        QRCodeP2M qrCodeP2M = new QRCodeP2M(p2mParser.foundTags,p2mParser.foundSubTagsMAI,p2mParser.foundSubTagsAdditional);
        qrCodeP2M.setId(UUID.randomUUID().toString());
        db2.put(_id++,qrCodeP2M);
        return qrCodeP2M;
    }
}
