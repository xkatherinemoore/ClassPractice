public class Pet {
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	//CONSTRUCTORS
	public Pet() {
		
	}
	
	public Pet(String petName, int petAge, String petLocation, String petType) {
		name = petName;
		age = petAge;
		location = petLocation;
		type = petType;
	}
	
	//GETTERS
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getType() {
		return type;
	}
	
	//SETTERS
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public void setLocation(String newLocation) {
		this.location = newLocation;
	}
	
	public void setType(String newType) {
		this.type = newType;
	}
}
