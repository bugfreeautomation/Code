package Constructor2;

public class Calculator {

	Floor floor;
	Carpet carpet;

	public Calculator(Floor floor, Carpet carpet) {

		this.floor = floor;
		this.carpet = carpet;
	}

	public double getTotalCost() {

		double total = floor.getArea() * carpet.getCost();
		System.out.println(total);
		return total;

	}

}
