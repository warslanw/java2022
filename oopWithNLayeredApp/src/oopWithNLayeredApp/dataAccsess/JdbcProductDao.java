package oopWithNLayeredApp.dataAccsess;

import oopWithNLayeredApp.entities.Product;

//implements = ProductDao nun implemansyonlarına uyan bir sınıfsın, uymak zorundasın demeye çalışıyoruz.
public class JdbcProductDao implements ProductDao {
	public void add(Product product ) {
		//sadece ve sadece db erişim kodları buraya yazılır... SQL
		//BİR SONRAKİ DERSE SQL BİLEREK GELECEĞİZ.
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
