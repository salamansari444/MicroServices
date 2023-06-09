package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StockPricApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPricApplication.class, args);
	}

}
