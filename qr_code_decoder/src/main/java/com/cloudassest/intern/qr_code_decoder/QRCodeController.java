package com.cloudassest.intern.qr_code_decoder;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@RestController
public class QRCodeController {

    private final DataBaseController dbControl;

    public QRCodeController(DataBaseController dbControl){
        this.dbControl=dbControl;
    }
    @GetMapping("/qrcodep2p")
    public Collection<QRCodeP2P>getP2p(){
       return dbControl.getP2p();
    }

    @PostMapping("/qrcodep2p")
    public QRCodeP2P createP2P(@RequestParam("userInput") String qrString) throws IOException {
        return dbControl.saveP2P(qrString);
    }

    @GetMapping("/qrcodep2m")
    public Collection<QRCodeP2M>getP2m(){
        return dbControl.getP2m();
    }
    @PostMapping("/qrcodep2m")
    public QRCodeP2M createP2M(@RequestParam("userInput1") String qrString) throws IOException {
        return dbControl.saveP2M(qrString);
    }



}
