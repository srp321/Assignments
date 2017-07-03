package DI;

public class JobDetails {
	String jobID;
	String post;
	double salary;
	String city;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("In Setter method");
		this.salary = salary;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getjobID() {
		return jobID;
	}

	public void setjobID(String jobID) {
		this.jobID = jobID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private JobDetails() {
		super();
		System.out.println("Parameterless Constructor is Necessary.");
	}

	@Override
	public String toString() {
		return "Job Details: [ JobID: " + jobID + ", Post: " + post + ", Salary: " + salary + ", city: " + city + "]";
	}

}
