
public class Store_PoolStand extends Store {

	public Store_PoolStand(Factory_Popsicle factory) {
		super(factory);
		System.out.println("We're at the pool.\n");
	}

	Popsicle createPopsicle(String item) {
		if (item.equals("Green Ice Pop") || item.equals("Red Ice Pop") ||item.equals("Blue Ice Pop")) {
			return new Popsicle_IcePops(item);
		} else {
			System.out.println("Sorry, we don't have that.\n");
			return null;
		}
	}


}