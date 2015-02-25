package demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value="/teste")
public class TesteController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello(){
		return "Hello World!"
	}
	
}