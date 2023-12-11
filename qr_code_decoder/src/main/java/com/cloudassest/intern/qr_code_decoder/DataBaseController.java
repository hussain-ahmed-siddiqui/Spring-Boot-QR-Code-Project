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

    private Integer _id=0;


    public List<QR_P2PModel> getP2p(){
        return p2PRepository.findAll();
    }
    public List<QR_P2MModel> getP2m(){
        return p2MRepository.findAll();
    }
    public QRCodeP2P saveP2P(String qrString){
        TagParserP2P p2pParser = new TagParserP2P();
        p2pParser.parse(qrString);
        QRCodeP2P qrCodeP2P = new QRCodeP2P(p2pParser.foundTags);
        qrCodeP2P.setId(UUID.randomUUID().toString());

        QR_P2PModel qrP2PModel = new QR_P2PModel(qrCodeP2P);
        p2PRepository.save(qrP2PModel);
        return qrCodeP2P;
    }
    public QRCodeP2M saveP2M(String qrString){
        TagParser p2mParser = new TagParser();
        p2mParser.parseString(qrString);
        QRCodeP2M qrCodeP2M = new QRCodeP2M(p2mParser.foundTags,p2mParser.foundSubTagsMAI,p2mParser.foundSubTagsAdditional);
        qrCodeP2M.setId(UUID.randomUUID().toString());
        QR_P2MModel qrP2MModel = new QR_P2MModel(qrCodeP2M);
        p2MRepository.save(qrP2MModel);
        return qrCodeP2M;
    }
}
