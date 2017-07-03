package autowireByConstructor;

public class ownDetail {
	int sal;
	int exp;
	public ownDetail(int sal, int exp){
		this.sal=sal;
		this.exp=exp;
	}
	public int getSal(){
		return sal;
	}
	public int getExp(){
		return exp;
	}
	@Override
	public String toString() {
	    return "Personal Info here is:"+"\tSal: "+sal+", Exp: "+exp;
	}
}
