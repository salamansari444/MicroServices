package in.ineuron.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockServiceClient {
	
	public String getTotalPrice(String companyName, Integer quantity) {
		
		String response=null;
		String REST_END_POINT="http://localhost:4444/api/calc/calc/calculate/{companyName}/{quantity}";
		WebClient webClient = WebClient.create();
		
		
		try {
			
			response = webClient.get().
					uri(REST_END_POINT,companyName,quantity).
					retrieve().
					bodyToMono(String.class).
					block();
			System.out.println(response);
			
		}catch(Exception e) {
			response="company not available";
		}
		
		return response;
	}
	

}
