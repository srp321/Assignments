package autowireByConstructor;

public class Person {
	int id;
	String name;
	ownDetail ownDetail;

	public Person(int id, String name, ownDetail ownDetail) {
		this.id = id;
		this.name = name;
		this.ownDetail = ownDetail;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ownDetail getOwnDetail() {
		return ownDetail;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + "\nSal: " + ownDetail.sal + ", Exp: " + ownDetail.exp;
	}
}