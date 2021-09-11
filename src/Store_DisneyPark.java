
public class Store_DisneyPark extends Store {

	public Store_DisneyPark(Factory_Popsicle factory) {
		super(factory);
		System.out.println("We are at Disneyworld!!!\n");
	}

	Popsicle createPopsicle(String item) {
		if (item.equals("Fudgecicle") || item.equals("Dreamsicle") ||item.equals("Ice Cream Sandwich")) {
			return new Popsicle_IceCream(item);
		} else if (item.equals("Watermelon popsicle") || item.equals("Strawberry popsicle") ||item.equals("Banana popsicle")) {
			return new Popsicle_Fruit(item);
		}else if (item.equals("Mickey's Cookies 'n Cream") || item.equals("Dole Whip") ||item.equals("Mickey's Premium Ice Cream Bar")) {
			return new Popsicle_Novelty(item);
		}
		else {
			System.out.println("Sorry, we don't have that.");
			return null;
		}
	}


}