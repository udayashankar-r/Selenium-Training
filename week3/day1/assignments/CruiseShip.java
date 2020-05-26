package week3.day1.assignments;

//public class CruiseShip extends Ship {	
public class CruiseShip extends CargoShip {	
	
	public void maximumPassengers(int passenger)
	{
		System.out.println("The no. of passenger in ship is : " +passenger);
	}

	public void cruiseCategory(String category)
	{
		System.out.println("The category of crusie in ship is : " +category);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CruiseShip cs = new CruiseShip();
		cs.shipName("Titanic");
		cs.shipbuiltYear("1912");
		cs.cargoCapacityinTons(100000);
		cs.maximumPassengers(2209);
		cs.cruiseCategory("Economy");

	}

}


