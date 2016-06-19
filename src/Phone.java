
public class Phone extends Device implements Set {
	private int devnumb;

	public Phone(String model, String brand, int devnumb) {
		super(model, brand);
		this.devnumb = devnumb;
	}

	public Phone() {
		this(" ", " ", 0);
	}

	public int getDevnumb() {
		return devnumb;
	}

	public void setDevnumb(int devnumb) {
		this.devnumb = devnumb;

	}
	public void info() {
		System.out.println("Device number: " + this.devnumb);
	}

	@Override
	public void create() {
		System.out.println("Create Phone.");

	}
}
