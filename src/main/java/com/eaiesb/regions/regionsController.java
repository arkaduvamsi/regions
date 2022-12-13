package com.eaiesb.regions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class regionsController {
	
	@Autowired
	public regionsService regService;
	
	@PostMapping("/regions")
	public regions createRegions(@Validated @RequestBody regions reg) {
		return regService.create(reg);
	}
	

}
