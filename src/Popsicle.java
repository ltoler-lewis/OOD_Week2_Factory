
abstract public class Popsicle {
	String name;
	String category;

	public String getName() {
		return name;
	}

	public String getType() {
		return category;
	}



	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("Here is your " + name + ".\n");
		return display.toString();
	}
}