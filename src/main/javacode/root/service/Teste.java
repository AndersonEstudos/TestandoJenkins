package root.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {

	@RequestMapping("/hello")
	public String hello(){
		return "hello stranger!!";
	}
}
