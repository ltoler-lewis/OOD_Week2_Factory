public class Factory_Popsicle {

	public Popsicle createPopsicle(String type) {
		Popsicle pop = null;

		if (type.equals("ice pop")) {
			pop = new Popsicle_IcePops("Lemon");
		}/* else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}*/
		return pop;
	}
}