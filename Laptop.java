class Laptop
{
	HardWare[] hard;
	Owner owner;
	Brand brand;
	
	Laptop(HardWare[] hard,Owner owner,Brand brand)
	{
		this.hard=hard;
		this.owner=owner;
		this.brand=brand;
	}
	void show()
	{
				System.out.println("starting of show in laptop");

		if(this.brand!=null)
		{
			brand.show();
		}
		if(this.owner!=null)
		{
			owner.show();
		}
		if(this.hard!=null)
		{
			for(int seq=0;seq<this.hard.length;seq++)
			{
				HardWare ref=hard[seq];
				ref.show();
				
			}
		}
						System.out.println("ending of show in laptop");

	}
}
		
		