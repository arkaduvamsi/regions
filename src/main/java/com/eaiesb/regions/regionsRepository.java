package com.eaiesb.regions;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface regionsRepository extends MongoRepository <regions, String>{

}
