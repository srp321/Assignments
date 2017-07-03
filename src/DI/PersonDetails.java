package DI;

public class PersonDetails {
	String name;
	String post;
	int num;
	String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("In Setter method");
		this.name = name;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private PersonDetails() {
		super();
		System.out.println("Parameterless Constructor is Necessary.");
	}

	@Override
	public String toString() {
		return "Person Details: [ Name: " + name + ", Post: " + post + ", Number: " + num + ", city: " + city + "]";
	}

}
