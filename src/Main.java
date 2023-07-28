
public class Main {

	public static void main(String[] args) {
		Pet myDog = new Pet();
		myDog.setName("Leia");
		myDog.setAge(1);
		myDog.setLocation("My House");
		myDog.setType("Golden Retriever");
		
		System.out.println(myDog.getName());
		
		Customer firstCustomer = new Customer("John", "Doe", "jdoe@gmail.com");
		Customer secondCustomer = new Customer("Jane", "Smith", "jsmith@outlook.com", "123-456-7890");
		Customer thirdCustomer = new Customer();
		
		System.out.println(firstCustomer.checkContactInfo()); //returns true
		System.out.println(secondCustomer.checkContactInfo()); //returns true
		System.out.println(thirdCustomer.checkContactInfo()); //returns false
		
		secondCustomer.getUserInfo(); //Prints info from function
		System.out.println(secondCustomer.getUserInfo()); //Prints info from function and return string

	}

}
