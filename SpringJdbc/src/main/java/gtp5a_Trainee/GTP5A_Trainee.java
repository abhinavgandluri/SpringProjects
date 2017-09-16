package gtp5a_Trainee;

public class GTP5A_Trainee {
	private int id;
	private int age;
	private String name;
    private String designation;
    private String graduation_group;
    
    GTP5A_Trainee(){
    	System.out.println("This the default constructor of Gtp5a_Trainee");
    }
    GTP5A_Trainee(int id,  String name,int age, String designation, String graduation_group){
    	this.id = id;
    	this.age = age;
    	this.name= name;
    	this.designation = designation;
    	this.graduation_group = graduation_group;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGraduation_group() {
		return graduation_group;
	}
	public void setGraduation_group(String graduation_group) {
		this.graduation_group = graduation_group;
	}
	

}
