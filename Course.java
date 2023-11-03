class Course
{
	String name;
	double fees;
	String provider;
	int duration;
	String courseMode;
	int noOfHoursDaily;
	int noOfStuJoined;
	
	
    Course(String name,double fees,String provider,String courseMode,int duration,int noOfHoursDaily,int noOfStuJoined)
	{
		this.name=name;
		this.fees=fees;
		this.provider=provider;
		this.courseMode=courseMode;
		this.duration=duration;
		this.noOfHoursDaily=noOfHoursDaily;
		this.noOfStuJoined=noOfStuJoined;
	}
	
	void display()
	{
		System.out.println("course name: "+name);
		System.out.println("course fees: "+fees);
		System.out.println("course provider: "+provider);
       	System.out.println("course mode: "+courseMode);
		System.out.println("course duration: "+duration);
				System.out.println("course noOfHoursDaily: "+noOfHoursDaily);
						System.out.println("course noOfStuJoined: "+noOfStuJoined);


					

	}
}