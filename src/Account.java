//Account.java
//Account class that contains an instance variable name
//and methods to configure and obtain its value.


public class Account 
{
	private String name;//instance variable
	// the constructor name initializes with the parameter name
	public Account(String name) 
	{
		this.name = name;
	}
	// method to set the name on the object
	public void setname(String name) 
	{
		this.name = name;// store the name
	}
	
	public String getName()
	{
		return name;//returns the name value to the caller
	}
	
}//end of class Account