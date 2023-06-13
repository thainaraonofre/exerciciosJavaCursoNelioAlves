package entities;

public class GuestData {

	private String name;
	private String email;

	public GuestData() {
	}

	public GuestData(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return 
				name + 
				", " 
				+ email;
		}
	
}
