
public abstract class Store {
 
	Factory_Popsicle factory;
	public Store(Factory_Popsicle factory) { 
		this.factory = factory;
	}
	abstract Popsicle createPopsicle(String item);
 
	public Popsicle orderPopsicle(String type) {
		Popsicle pop = createPopsicle(type);

		return pop;
	}
}



//Original code
/*public class Store {
	Factory_Popsicle factory;
 
	public Store(Factory_Popsicle factory) { 
		this.factory = factory;
	}
 
	public Popsicle orderPopsicle(String type) {
		Popsicle pop;
 
		pop = factory.createPopsicle(type);

		return pop;
	}

}*/