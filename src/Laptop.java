
public class Laptop extends Device implements Set {
	private String color;

	public Laptop(String model, String brand, String color) {
		super(model, brand);
		this.color = color;
	}

	public Laptop() {
		this(" ", " ", " ");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void info() {
		System.out.println("Color: " + this.color);
	}

	@Override
	public void create() {
		System.out.println("Create Laptop.");

	}
}
