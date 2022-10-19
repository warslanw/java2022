package kodlamaIoApp.entities;

public class Product {
	private String egitmen;
	private String katagori;
	private String kurs;
	private double unitKursPrice;

	public Product() {
		super();
	}

	public Product(String egitmen, String katagori, String kurs, double unitKursPrice) {
		super();
		this.egitmen = egitmen;
		this.katagori = katagori;
		this.kurs = kurs;
		this.unitKursPrice = unitKursPrice;
	}

	public String getEgitmen() {
		return egitmen;
	}

	public void setEgitmen(String egitmen) {
		this.egitmen = egitmen;
	}

	public String getKatagori() {
		return katagori;
	}

	public void setKatagori(String katagori) {
		this.katagori = katagori;
	}

	public String getKurs() {
		return kurs;
	}

	public void setKurs(String kurs) {
		this.kurs = kurs;
	}

	public double getUnitKursPrice() {
		return unitKursPrice;
	}

	public void setUnitKursPrice(double unitKursPrice) {
		this.unitKursPrice = unitKursPrice;
	}

}
