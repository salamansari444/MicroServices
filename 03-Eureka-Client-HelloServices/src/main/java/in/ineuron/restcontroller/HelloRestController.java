	package in.ineuron.restcontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/hello/{name}")
	public String displayMsg(@PathVariable String name) {
		
		String heyMsg="Hello ";
		return heyMsg+name+" how are u ?";
	}

}
