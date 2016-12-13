package petshop1;

public class dogs extends person {
public dogs(String name) {
	super(name);
}

public void pulls(String Interesteddog, owner owner, customer customer) {
	System.out.println(this.name + ": BARK!BARK");
	owner.serve(Interesteddog, customer);
}

}

