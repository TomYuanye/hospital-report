package com.synex.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {
	@GetMapping("/hello")
    public String sayHi() {
        return "Hi from Annie!";
    }
	@GetMapping("/info")
	public String info() {
		return "This is Annie asking for a refill of 10 burgers!";
	}
}
