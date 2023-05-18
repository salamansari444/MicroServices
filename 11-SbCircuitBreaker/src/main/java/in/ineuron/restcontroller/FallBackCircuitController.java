package in.ineuron.restcontroller;

import java.util.Random;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/api/fallback")
public class FallBackCircuitController {
	
	
	
	@GetMapping("/show")
	@HystrixCommand(fallbackMethod = "showFallBack")
	public String showMsg() {
		System.out.println("FallBackCircuitController.showMsg()");
		
		if(new Random().nextInt(10)<=10) {
			throw new RuntimeException("DUMMY EXCEPTION");
		}
		return "Hello From Provider";
	}
	
	public String showFallBack() {
		System.out.println("FallBackCircuitController.showFallBack()");
		
		return "From Fall Back Method	";
	}
	

}
