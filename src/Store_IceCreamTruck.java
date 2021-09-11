
public class Store_IceCreamTruck extends Store {

	public Store_IceCreamTruck(Factory_Popsicle factory) {
		super(factory);
		System.out.println("The ice cream truck is here!\n");
	}

	Popsicle createPopsicle(String item) {
		if (item.equals("Fudgecicle") || item.equals("Dreamsicle") ||item.equals("Ice Cream Sandwich")) {
			return new Popsicle_IceCream(item);
		} else if (item.equals("Watermelon popsicle") || item.equals("Strawberry popsicle") ||item.equals("Banana popsicle")) {
			return new Popsicle_Fruit(item);
		}
		else {
			System.out.println("Sorry, we don't have that.");
			return null;
		}
	}


}