
    //OOP-object oriented - nesne,obje güdümlü programlama
package oop1;

public class Main {

	public static void main(String[] args) {
		//String veri tipi, mesaj ona verdiğimiz isim; abc her şeyi verebiliriz.
		String mesaj = "Vade oranı";
		//Product veri tipi, product1 ona verdiğimiz isim. Bir class'a veri atama, değişken atama; new Product(); olarak yapılır.
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		         //Aşağıda açıklamalarla birlikte izah ettiğimiz bu harekete 'set value' denir, yani değer atma işlemi.
		//Yeni bir product nesnesi, şablonumuzu dolduruyoruz:
		//product1 in string olan name özelliğine (product1 dediğimiz bizim bir ürünü tanımlamak için oluşturduğumuz, tanımladığımız class.)
	
		
		         //get , okuma işlemi.
		//System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1, product2, product3};
		                       // ... : products = products tek tek gez demektir. Süslü parentezin içindekileri ekrana yaz demek.
		System.out.println("<ul>");
		for (Product product : products) {
			//Ekrana gelen productların name ini yaz demektir.
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05334665522");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Vural");
		individualCustomer.setLastName("ARSLAN");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Koadlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setCompanyName("112345");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		
		
		
	}

}
