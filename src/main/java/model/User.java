package model;

public class User {
	private int id;
	private String ongName;
	private String typePets;
	private String email;
	private String phone;
	private String city;
	private String zipCode;
	private String address;
	private String addressNumber;
	private String description;
	private String neighborhood;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOngName() {
		return ongName;
	}
	public void setOngName(String ongName) {
		this.ongName = ongName;
	}
	public String getTypePets() {
		return typePets;
	}
	public void setTypePets(String typePets) {
		this.typePets = typePets;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
		
	public String getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", ongName=" + ongName + ", typePets=" + typePets + ", email=" + email + ", phone="
				+ phone + ", city=" + city + ", zipCode=" + zipCode + ", address=" + address + ", neighborhood=" + neighborhood + ", addressNumber="
				+ addressNumber + ", description=" + description + "]";
	}
	
	
	
}
