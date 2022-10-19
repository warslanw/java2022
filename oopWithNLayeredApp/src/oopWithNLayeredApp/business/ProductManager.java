package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccsess.HibernateProductDao;
import oopWithNLayeredApp.dataAccsess.ProductDao;
import oopWithNLayeredApp.dataAccsess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
    public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception  {
    	//iş kurallarını yazıyoruz
    	if(product.getUnitPrice()<10) {
    		throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
    	}
    	
    	productDao.add(product);
    	
    	for (Logger logger : loggers) {  //[db,mail]
			logger.log(product.getName());
		}
    }
}
