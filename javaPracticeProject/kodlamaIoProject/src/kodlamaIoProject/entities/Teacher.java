package kodlamaIoProject.entities;

public class Teacher {
	
	int id;
	String firstName;
	String lastName;
	String title;
	
	public Teacher() {
		
	}

	public Teacher(int id, String firstName, String lastName, String title) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
