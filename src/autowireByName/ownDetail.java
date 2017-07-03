package autowireByName;

public class ownDetail {
	int sal;
	int exp;

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getExp() {
		return exp;
	}

	@Override
	public String toString() {
		return "Personal Info here is:" + "\tSal: " + sal + ", Exp: " + exp;
	}
}
