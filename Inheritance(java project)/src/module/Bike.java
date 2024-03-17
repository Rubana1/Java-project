package module;

public class Bike extends Engine {
	private String brand;
	private String model;

	public Bike(String fuelType, int horsepower, String brand, String model) {
		super(fuelType, horsepower);
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
