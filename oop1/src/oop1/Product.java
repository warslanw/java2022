package oop1;

//PascalCase = İsimlendirme standardı ismi. Kelimelerin ilk harfi büyük.
//Burada bir ürün tanımlamıyoruz, ürünü tanımlayabilecek ortamı hazırlıyoruz.

   //private yaptıktan sonra boş bir satıra -en son satırdaki güzel parantezin üstündeki satır- sağ tık yapıp, source, generate Getters and Setters işlemi yapılalıdır.
   // sağ tık yapıp format demeyi unutmuyoruz.
public class Product {
	// class dediğimiz şey şablondur.
	// Benim 'Product' diye bir nesnem var ve içinde de 'name' diye bir bilgi tutmak
	// istiyorum. başka ne tutmak istiyorum = unitPrice, discount.
	// private sadece bu class ın içinde kullanıabilir demektir.
	private String name;
	// camelCase
	private double unitPrice;
	private double discount;
	String imageUrl;
	// çok fotoğraf olursa eğer ' String[] imageUrls; ' şeklinde yazarız. bunlar
	// tamamen domain(iş) ile alakalı.
	private int unitsInStock;

	// mavi olanlar bizim verdiğimiz isimler, double, String, int ver tiplerimizdir.
	// class 'ın alanları (fieldları) 'name, unitPrice, discount,
	// imageUrl,UnitsInStock ' tur ve field'lar camelCase yazılır.
	public String getName() {
		return name;
	}
   //set yazmak
	public void setName(String name) {
		this.name = name;
	}
   // get okumak.
	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
