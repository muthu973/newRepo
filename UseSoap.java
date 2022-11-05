package getterandsetter;

public class UseSoap {
	public static void main(String[] args) {
		Soap s1 = new Soap("CINTHOL",100,50.65F,"GREEN","15th Oct 2022");
		System.out.println(s1);
		System.out.println("--------------------------------------------------------");
		
		Soap s2 = new Soap("LUX",120,40.5F,"PINK","21st Nov 2022");
		System.out.println(s2);
		System.out.println("--------------------------------------------------------");
		
		float price1 = s1.price;
		float price2 = s2.price;
		if(price1 < price2) {
			System.out.println(s1.brand+" is Costiler than "+s2.brand);
		}
		
		Soap s3 = new Soap();
		s3.setBrand("DOVE");
		System.out.println("Brand is:"+s3.getBrand());
		s3.setNetWeight(150);
		System.out.println("Net Weight is:"+s3.getNetWeight());
		s3.setPrice(80.8f);
		System.out.println("Price is:"+s3.getPrice());
		s3.setColour("WHITE");
		System.out.println("Colour is:"+s3.getColour());
		s3.setExpiryDate("30th Oct 2022");
		System.out.println("Expiry Date is:"+s3.getExpiryDate());
		
	}

}
