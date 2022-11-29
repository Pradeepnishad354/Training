package co.proj;

public class Address {
	
	String city;
	int zipcode;
	String street;
	
	
	Address(String city,int zipcode,String street){
		
		this.city=city;
		this.zipcode=zipcode;
		this.street=street;
		
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", zipcode=" + zipcode + ", street=" + street + "]";
	}
	

}
