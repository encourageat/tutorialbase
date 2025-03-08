package com.encourageat.lessonresserver.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResServerController {
	
	@GetMapping("/greeting")
	public String greeting(Authentication auth) {
		return "Hello there! + Authorities: " + auth.getAuthorities();
	}
	
	//TODO: GetAuthorties return roles
	@GetMapping("/greetingrole")
	@PreAuthorize("hasAuthority('FINANCE')")
	public String greetingRole(Authentication auth) {
		return "Hello there! + Authorities: " + auth.getAuthorities();
	}


}











