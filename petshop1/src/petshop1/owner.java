package petshop1;
	public class owner extends person{

		public owner(String name) {
			super(name);
		}
		
		public void spets(customer customer, dogs dogs) {
			System.out.println(this.name + ": Welcome to HappyPetshop");
			this.showscages(customer, dogs);
		}
		
		private void showscages(customer customer, dogs dogs) {
			System.out.println(this.name + ":Do you have prefering specie?.");
			customer.Look(this,dogs);
			
		}
		
		public void takelook(String Interesteddog, customer customer, dogs dogs, owner owner) {
			System.out.println(this.name + ": AH HA You are looking for" + Interesteddog + "?");
			dogs.pulls(Interesteddog, owner, customer);
		}


		public void serve(String Interesteddog, customer customer) {
			System.out.println(this.name + ": How about this " + Interesteddog + "?");
			customer.pets(Interesteddog);
		}

	}