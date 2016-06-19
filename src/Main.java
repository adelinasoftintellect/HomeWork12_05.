class Device {
	private String model;
	private String brand;

	public Device(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}

	public Device() {
		this(" ", " ");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void info() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
	}

}

public class Main {

	public static void main(String[] args) {
		DeviceFactory deviceFactory = new DeviceFactory();

		Set device1 = deviceFactory.getSet("TABLET");
		device1.create();

		Set device2 = deviceFactory.getSet("PHONE");
		device2.create();

		Set device3 = deviceFactory.getSet("LAPTOP");
		device3.create();


	}
}
