
public class Tablet extends Device implements Set {
	private float price;

	public Tablet(String model, String brand, float price) {
		super(model, brand);
		this.price = price;
	}

	public Tablet() {
		this(" ", " ", 0);
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void info() {
		System.out.println("Price: " + this.price);
	}

	@Override
	public void create() {
		System.out.println("Create Tablet.");

	}
}
