package CS102_Project;

public abstract class Person {
	private String id;
	private String name;
	private String email;
	private static int idInteger = 1;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Person(String name) {
		this.name = name;
		String formatted = String.format("%04d", idInteger++);
		String firstName = name.substring(0, name.indexOf(" ")).trim();
		String lastName = name.substring(name.indexOf(" ") + 1).trim();
		id = firstName.charAt(0) + lastName.charAt(0) + formatted;
		initEmail();
	}

	public abstract void initEmail();

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String mail) {
		this.email = mail;
	}

	public String toString() {
		return id + ", " + name + ", " + email;
	}
}
