package kodlamaIoApp.dataAccess;

import kodlamaIoApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
   	 System.out.println("Hibernate ile veritabınına eklendi");
    }
}
