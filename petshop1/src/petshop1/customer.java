package petshop1;
public class customer extends person {
String InterestedDog;
	
	public customer(String name, String InterestedDog) {
		super(name);
	}
	
	public void enter(owner owner, dogs dogs) {
		System.out.println("Hi! (BARK!BARK!)");
		owner.spets(this, dogs);

	}
	
	public void Look(owner owner, dogs dogs) {
		System.out.println(this.name + ": I am looking for" + this.InterestedDog + "!");
		owner.takelook(this.InterestedDog, this, dogs, owner);

	}
	
	public void pets(String dog) {
		System.out.println(this.name + ": Wow, this guy is very smart" + dog + "!");
	}
	
	public static void main(String[] args) {
		customer myCustomer = new customer("Tom", "Dog");
		owner myowner = new owner("James");
		dogs mydogs = new dogs("BorderCollie");
		
		myCustomer.enter(myowner, mydogs);
	}
}
