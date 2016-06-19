
public class DeviceFactory {
	// use getSet method to get object of type shape
	public Set getSet(String setType) {
		if (setType == null) {
			return null;
		}
		if (setType.equalsIgnoreCase("TABLET")) {
			return new Tablet();

		} else if (setType.equalsIgnoreCase("PHONE")) {
			return new Phone();

		} else if (setType.equalsIgnoreCase("LAPTOP")) {
			return new Laptop();
		}

		return null;
	}
}
