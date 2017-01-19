package Animals;

public class Animmal {
private String sound = "Hello";
public static void main(String [] args){ ;
	Dog d = new Dog();
		Cat c = new Cat();
		Human h = new Human ();
		System.out.println("Sound of Animals");
		d.soundlikeSparky();
		c.soundlikeMeowy();
		h.soundlikeTim();
}
public void soundlike(){
	
	System.out.println(sound);
}
}