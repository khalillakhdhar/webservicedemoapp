package com.webservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.model.Presentation;

@RestController
@RequestMapping("presentation")
public class PresentationController {
	@GetMapping
	public String welcome()
	{
		return "hello from controller";
	}
	@PostMapping
	public Presentation presentation(@RequestBody Presentation presentation)
	{
		return presentation;
	}
	

}
