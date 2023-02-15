package model.entities;

public class Address {
	private String publicPace;
	private String number;
	private String complement;
	private String neighborhood_district;
	private String city;
	private String zipCode;
	private String uf;
	
	public Address() {
		
	}
	
	public Address(String publicPace, String number, String complement, String neighborhood_district, String city,
			String zipCode, String uf) {
		this.publicPace = publicPace;
		this.number = number;
		this.complement = complement;
		this.neighborhood_district = neighborhood_district;
		this.city = city;
		this.zipCode = zipCode;
		this.uf = uf;
	}

	public String getPublicPace() {
		return publicPace;
	}
	public void setPublicPace(String publicPace) {
		this.publicPace = publicPace;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getNeighborhood_district() {
		return neighborhood_district;
	}
	public void setNeighborhood_district(String neighborhood_district) {
		this.neighborhood_district = neighborhood_district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
}
