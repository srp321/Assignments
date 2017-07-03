package autowireByName;

public class Person {
	int id;
	String name;
	ownDetail ownDetail;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setOwnDetail(ownDetail ownDetail) {
		this.ownDetail = ownDetail;
	}

	public ownDetail getOwnDetail() {
		return ownDetail;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + "\nSal: " + ownDetail.sal + ", Exp: " + ownDetail.exp;
	}
}