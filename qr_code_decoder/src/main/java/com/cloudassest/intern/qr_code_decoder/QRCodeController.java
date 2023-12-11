package com.cloudassest.intern.qr_code_decoder;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class QRCodeController {

    private final DataBaseController dbControl;

    public QRCodeController(DataBaseController dbControl){
        this.dbControl=dbControl;
    }
//    @GetMapping("/qrcodep2p")
//    public List<QR_P2PModel> getP2p(){
//       return dbControl.getP2p();
//    }

    @PostMapping("/qrcodep2p")
    public QRCodeP2P createP2P(@RequestParam("userInput") String qrString) throws IOException {
        return dbControl.saveP2P(qrString);
    }

//    @GetMapping("/qrcodep2m")
//    public List<QR_P2MModel> getP2m(){
//        return dbControl.getP2m();
//    }
    @PostMapping("/qrcodep2m")
    public QRCodeP2M createP2M(@RequestParam("userInput1") String qrString) throws IOException {
        return dbControl.saveP2M(qrString);
    }



}
