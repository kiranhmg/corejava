class AshokaLeyland extends Truck
{
	
	int chassiNo;
	String model;
	
	AshokaLeyland()
	{
				System.out.println("no-arg const of AshokaLayland");
	}
	AshokaLeyland(int noOfWheels,int noOfDoors,int noOfGears,int noOfSeats,String owner,int chassiNo,String model)
	{
		super(noOfWheels,noOfDoors,noOfGears,noOfSeats,owner);

		this.chassiNo=chassiNo;
		this.model=model;
	}
	void setDetails(String company,double cost,double carryCapacity,double truckWeight,float truckHeight)
	{
		super.setProperties(company,cost,carryCapacity,truckWeight,truckHeight);
	}
	void carryCylinders()
	{
				System.out.println("truck is used to carry cylinders");
	}
	void carryGarbage()
	{
				System.out.println("truck is used to carry garbage");
	}
	void usedAsSnowPlow()
	{
				System.out.println("truck is used as snow plow");
	}
		void carryStone()
	{
		System.out.println("truck is used to carry stones of differrent size");
	}
	void carrySand()
	{
		System.out.println("truck is used to carry sand from one place another place");
	}
	void carryCement()
	{
				System.out.println("truck is used to carry cement bags");
	}
	void carryTank()
	{
				System.out.println("truck is used to carry water tank and many more");
	}
}




	