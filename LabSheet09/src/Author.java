
public class Author {
	
	private String name;
	private String email;
	private char gender ;
	Author(String name,char gnder) 
	{
		this.name = name;
		this.gender = gender;
	}
	Author(String name ,String email)
	{
		this.name=name;
		this.email=email;
	}
	Author()
	{
		name ="";
		email="";
		gender=' ';
	}
	//getName
	public String getName( ) 
	{
		return name;
	}
	//getEmail
	public String getEmail( ) 
	{
		return email;
	}
	//getGenderName
	public String getGenderName() 
	{
		if(gender=='M'||gender=='m') 
		{
			return "Male";
		}
		else if(gender=='F'||gender=='f') 
		{
			return "Female";
		}
		else 
		{
			return null;
		}
	}
	public String toString() 
	{
		return "Author name:" + name + "(" + email + ";"+ getGenderName() + ")";
	}
}//endClass
