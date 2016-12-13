 package recip;

import java.util.Scanner;

public class reccip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double priceNoodle=8;
		double pricePeach=3;
		double priceMilk=2;
		double priceCola=2;
		
		
		
		System.out.printf("Noodle costs $%4.2f.",priceNoodle);
		System.out.printf("Peach costs $%4.2f.",pricePeach);
		System.out.printf("Milk costs $%4.2f.",priceMilk);
		System.out.printf("Cola costs $%4.2f.",priceCola);
		System.out.println("How many do you want to buy?");
		
		int numNoodle=input.nextInt();
		
		int numPeach=input.nextInt();
		
		int numMilk=input.nextInt();
		
		int numCola=input.nextInt();
		
		
		
		
		
		double total=numNoodle*priceNoodle+numPeach*pricePeach+numMilk*priceMilk+numCola*priceCola;
		System.out.printf("__________________________________________%n");
		System.out.printf("|                                        |%n");
		System.out.printf("|                Jeff-Mart               |%n");
		System.out.printf("|                                        |%n");
		System.out.printf("|  products(price)     amount    price   |%n");
		System.out.printf("|                                        |%n");
		System.out.printf("|  Noodle  (%4.2f)    %2d      $%6.2f    |%n",priceNoodle,numNoodle,priceNoodle*numNoodle);
		System.out.printf("|  Peach   (%4.2f)     %2d      $%6.2f   |%n",pricePeach,numPeach,pricePeach*numPeach);
		System.out.printf("|  Milk    (%4.2f)     %2d      $%6.2f   |%n",priceMilk,numMilk,priceMilk*numMilk);
		System.out.printf("|  Cola   (%4.2f)     %2d      $%6.2f    |%n",priceCola,numCola,priceCola*numCola);
		System.out.printf("|                                        |%n");
		System.out.printf("|                                        |%n");
		System.out.println("|     TOTAL "+total+ "                  |");
		System.out.printf("__________________________________________%n");

	}
}

