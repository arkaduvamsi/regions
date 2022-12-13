package com.eaiesb.regions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class regionsService {
	
	@Autowired
	public regionsRepository regionsRepo;
	
	public regions create(regions reg) {
		return regionsRepo.save(reg);
	}

}
