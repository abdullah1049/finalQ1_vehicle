package finalQ1_code;

public  class Truck extends Vehicle implements vehicle_abs {

	private int NumberOfAxels;
	public Person newOwner;

	public Truck(){
	}
	
	public Truck(int NumberOfAxels, Person Owner){
		this.NumberOfAxels=NumberOfAxels;
		this.Owner= Owner;
	}
	
	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}
	
	public Person ownership(Person newOwner){
		super.transferOwnerShip(newOwner);
		 return  newOwner;
	}

	
}
