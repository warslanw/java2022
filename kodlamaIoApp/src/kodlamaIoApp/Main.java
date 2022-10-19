package kodlamaIoApp;

import java.util.List;

import kodlamaIoApp.business.ProductManager;
import kodlamaIoApp.core.logging.DatabaseLogger;
import kodlamaIoApp.core.logging.FileLogger;
import kodlamaIoApp.core.logging.Logger;
import kodlamaIoApp.core.logging.MailLogger;
import kodlamaIoApp.dataAccess.HibernateProductDao;
import kodlamaIoApp.dataAccess.jdbcProductDao;
import kodlamaIoApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product("Engin DEMİROĞ", "Programlama", "Java", 2700);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);

	}

}
