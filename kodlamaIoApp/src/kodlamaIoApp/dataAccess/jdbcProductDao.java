package kodlamaIoApp.dataAccess;

import kodlamaIoApp.entities.Product;

public class jdbcProductDao implements ProductDao {
     public void add(Product product) {
    	 System.out.println("JDBC ile veritabınına eklendi");
     }
}


