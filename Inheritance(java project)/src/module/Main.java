package module;

public class Main {

	public static void main(String[] args) {
		Car c = new Car("Diesel",300,"Rolls royce","Phantom");
		Bike b = new Bike("petrol",100,"Royal Enfield","Classic 350");
				
		System.out.println("Car");
		System.out.println("Brand:" +c.getBrand());
		System.out.println("Model:" +c.getModel());
		System.out.println("fueltype:" +c.getFuelType());
		System.out.println("Power:" +c.getHorsepower());
				
		System.out.println("Bike:");
		System.out.println("Brand:" +b.getBrand());
		System.out.println("Model:" +b.getModel());
		System.out.println("Fueltype:" +b.getFuelType());
		System.out.println("Power:" +b.getHorsepower());

	}

}
