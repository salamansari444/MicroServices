package in.ineuron.restcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ineuron.service.StockServiceClient;


@Controller
public class StockUiController {
	
	@Autowired
	private StockServiceClient service;
	
	public String loadPage() {
		System.out.println(" Stock Ui Load Page");
		
		return "index";
	}
	
	@GetMapping("/getTotalCost")
	public String getTotalCost(HttpServletRequest request, Model model) {
		
		
		String companyName = request.getParameter("companyName");
		String quantity = request.getParameter("quantity");
		
		String totalPrice = service.getTotalPrice(companyName, Integer.parseInt(quantity));
		System.out.println(totalPrice);
		model.addAttribute("msg", totalPrice);
		
		return "index";
	}

}
