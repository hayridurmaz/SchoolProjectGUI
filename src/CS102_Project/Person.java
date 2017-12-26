package CS102_Project;

public abstract class Person {
	private String id;
	private String name;
	private String email;

	public Person(String name) {
		this.name = name;
	}

	public abstract void  initEmail();

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String mail) {
		this.email = mail;
	}
	public String toString () {
		return ("albala");
	}
}
