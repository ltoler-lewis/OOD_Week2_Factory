
public class PopsicleTime {
 
	public static void main(String[] args) {
		Factory_Popsicle factory = new Factory_Popsicle();
		Store poolstand = new Store_PoolStand(factory);
		
		Popsicle pop = poolstand.orderPopsicle("Green Ice Pop");
		System.out.println("We ordered a " + pop.getName() + ".");
		System.out.println(pop);
		
		
		Store iceCreamTruck = new Store_IceCreamTruck(factory);
		
		Popsicle pop2 = iceCreamTruck.orderPopsicle("Dreamsicle");
		System.out.println("I ordered a " + pop2.getName() + ".");
		System.out.println(pop2);
		
		Popsicle pop3 = iceCreamTruck.orderPopsicle("Strawberry popsicle");
		System.out.println("And I ordered a " + pop3.getName() + ".");
		System.out.println(pop3);
		
		
		Store disney = new Store_DisneyPark(factory);
		
		Popsicle pop4 = disney.orderPopsicle("Dreamsicle");
		System.out.println("I ordered a " + pop4.getName() + ".");
		System.out.println(pop4);
		
		Popsicle pop5 = disney.orderPopsicle("Mickey's Cookies 'n Cream");
		System.out.println("And I ordered a " + pop5.getName() + ".");
		System.out.println(pop5);
		
	}
}