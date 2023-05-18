package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.entity.StockPrice;
import in.ineuron.exception.StockNotFoundException;
import in.ineuron.repo.IStockPriceRepo;

@Service
public class StockServiceImpl implements IStockService {
	
	@Autowired
	private IStockPriceRepo repo;

	@Override
	public Double fetchByCompanyName(String companyName) {
		
		StockPrice stockPrice = repo.findByCompanyName(companyName);
		if(stockPrice==null) {
			throw new StockNotFoundException("Company not available");
		}
		return stockPrice.getCompanyPrice();
		
	}

}
