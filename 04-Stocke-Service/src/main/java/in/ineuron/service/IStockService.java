package in.ineuron.service;

import in.ineuron.entity.StockPrice;

public interface IStockService {
	public Double fetchByCompanyName(String companyName);
}
