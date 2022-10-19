package kodlamaIoApp.business;

import java.util.List;

import kodlamaIoApp.core.logging.Logger;
import kodlamaIoApp.dataAccess.HibernateProductDao;
import kodlamaIoApp.dataAccess.ProductDao;
import kodlamaIoApp.dataAccess.jdbcProductDao;
import kodlamaIoApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
    public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
    	
    	if(product.getUnitKursPrice()<0) {
    		throw new Exception("Bir kursun fiyatı 0'dan küçük olamaz");
    	}
    	productDao.add(product);
    	
    	for (Logger logger : loggers) {
			logger.log(product.getEgitmen());
		}
    }
}
