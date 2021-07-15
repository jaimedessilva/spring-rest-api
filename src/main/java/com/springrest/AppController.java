package com.springrest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springrest
 * @author Desenvolvedor
 * 15 de jul de 2021
 *  https://github.com/jaimedessilva/
 */

@RestController
public class AppController {
	
	@Value("${app.message}")
	private String appMessage;
	
	@GetMapping("/")
	public String getAppMessage() {
		return appMessage;
	}
}
