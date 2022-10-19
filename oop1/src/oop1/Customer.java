package oop1;

public class Customer {
	// id: bir datayı diğerinden ayırdığımız sıralı veri kaynağıdır. Genellikle
	// 1,2,3,4, ... sıralı gider.
	private int id;
	private String customerNumber;
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
