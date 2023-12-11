package com.cloudassest.intern.qr_code_decoder;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface P2M_Repository extends MongoRepository<QR_P2MModel,String > {

}
