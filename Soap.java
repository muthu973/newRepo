package getterandsetter;

public class Soap {
	String brand;
	int netWeight;
	float price;
	String colour;
	String expiryDate;
	
	public Soap(String brand, int netWeight, float price, String colour, String expiryDate) {
		this.brand=brand;
		this.netWeight=netWeight;
		this.price=price;
		this.colour=colour;
		this.expiryDate=expiryDate;
	}
	public Soap() {
		
	}
	
		
		
	public void setBrand(String brand) {
	
		this.brand=brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setNetWeight(int netWeight) {
		this.netWeight=netWeight;
	}
	
	public int getNetWeight() {
		return this.netWeight;
	}
	
	public void setPrice(float price) {
		this.price=price;
	}
	
	public float getPrice() {
		return this.price;
	
	}
	
	public void setColour(String colour) {
		this.colour=colour;
	}
	
	public String getColour() {
		return this.colour;
	
	}
	
	public void setExpiryDate(String expiryDate) {
		this.expiryDate=expiryDate;
	}
	
	public String getExpiryDate() {
		return this.expiryDate;
	}
	
	@Override
	public String toString() {
		
		return "Brand is:"+this.brand+", Net Weight is:"+this.netWeight+", Price is:"+this.price+", Colour is:"+this.colour+", Expiry Date is:"+this.expiryDate;
	}
}

