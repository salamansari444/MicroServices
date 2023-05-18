package in.ineuron.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;

import in.ineuron.feignClient.HelloClient;

@RestController
public class HiRestController {
	
	@Autowired
	private HelloClient feignClient;
	
	
	@GetMapping("/hi/{name}")
	public String displayMsg(@PathVariable String name) {
		
		String heyMsg="Hey ";
		String helloService = feignClient.invokeHelloService(name);
		return heyMsg+" "+helloService+" "+" how are u ?";
	}

}
