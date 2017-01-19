package petshop1;

public class dogs extends person {
public dogs(String name) {
	super(name);
}

public void pulls(String mydogs, owner owner, customer customer) {
	System.out.println(this.name + ": BARK!BARK");
	System.out.println(this.name + ":   __A___A__");
	System.out.println(this.name + ":  | o     o |");
	System.out.println(this.name + ":  [  ( ¡Ü )  ]");
	System.out.println(this.name + ":   [[[[0]]]]");
	System.out.println(this.name + ":  [         ]");
	System.out.println(this.name + ":  [ | | | | ]");
	System.out.println(this.name + ": [  | | | |  ]");
	System.out.println(this.name + ": m[ mmm mmm ]m");
	

	
	owner.serve(  mydogs , customer);
}

}

 