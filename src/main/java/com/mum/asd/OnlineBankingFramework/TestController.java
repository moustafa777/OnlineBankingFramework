package com.mum.asd.OnlineBankingFramework;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@RestController
@RequestMapping("/api")
public class TestController {

	
		@RequestMapping(value = "/user", method = RequestMethod.GET)
	    public void greeting() {
	      
	    System.out.println("fddsa");
	    }
}
