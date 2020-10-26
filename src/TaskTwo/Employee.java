package TaskTwo;

public class Employee {
	public String title;
	
	public String name;
	
	public String mobile;
	
	public Employee(String title, String name, String mobile)
	{
		super();
		this.title=title;
		this.name=name;
		this.mobile=mobile;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title= title;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile= mobile;
	}
	
	@Override
	public String toString() {
		return "Name "+name+"- Mobile "+
				mobile;
	}
	
}
