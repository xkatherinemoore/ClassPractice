
public class Customer {
	
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	
	//CONSTRUCTORS
	public Customer() {
		
	}
	
	public Customer(String firstName, String lastName) {
		firstname = firstName;
		lastname = lastName;
	}
	
	public Customer(String firstName, String lastName, String emailAddr) {
		firstname = firstName;
		lastname = lastName;
		email = emailAddr;
	}
	
	public Customer(String firstName, String lastName, String emailAddr, String phoneNum) {
		firstname = firstName;
		lastname = lastName;
		email = emailAddr;
		phone = phoneNum;
	}
	
	//GETTERS
	public String getFirstName() {
		return firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	//SETTERS
	public void setFirstName(String newFirstName) {
		firstname = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastname = newLastName;
	}
	
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	public void setPhone(String newPhone) {
		phone = newPhone;
	}
	
	//Checks for contact info
	public boolean checkContactInfo() {
		//Checks phone value
		if (this.phone == null || this.phone == "") {
			//Checks email value if phone value is null or empty string
			if (this.email == null || this.email == "") {
				return false;
			} else {
				return true;
			}	
		} else {
			return true;
		}
	}
	
	//Returns user contact info as string
	public String getUserInfo() {
		String userInfo = "\nFirst Name: " + firstname +"\nLast Name: " + lastname + "\nEmail: " + email + "\nPhone: " + phone;
		System.out.printf("\n%s %s can be contacted by email at: %s", firstname, lastname, email);
		System.out.printf("\n%s %s can be contacted by phone at: %s", firstname, lastname, phone);
		
		return userInfo;
	}
}
