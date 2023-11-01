class Rocket
{
	String name;
	double weight;
	String builtIn;
	double carryCapacity;
	
	Rocket()
	{
		super();
		System.out.println("Rocket name: "+name);
	}
	Rocket(String name)
	{
		super();
		this.name=name;
		System.out.println("Rocket name: "+name);
	}
	Rocket(double weight,String builtIn)
	{
		super();
		this.builtIn=builtIn;
		this.weight=weight;
		System.out.println("Rocket weight and builtIn: "+weight+" "+builtIn);
	}
	Rocket(double carryCapacity,double weight)
	{
		super();
		this.carryCapacity=carryCapacity;
		this.weight=weight;
		System.out.println("Rocket carryCapacity and weight: "+carryCapacity+" "+weight);
	}
	Rocket(String name,String builtIn,double carryCapacity)
	{
		super();
		this.name=name;
		this.builtIn=builtIn;
		this.carryCapacity=carryCapacity;
		System.out.println("Rocket name builtIn and carryCapacity: "+name+" "+builtIn+" "+carryCapacity);
	}
}
	
	
	