
public abstract class Intern  {
	
	private String internId;
	private String internName;
	private double internSalary;
	

	public String getInternId() {
		return internId;
	}


	public void setInternId(String internId) {
		this.internId = internId;
	}


	public String getInternName() {
		return internName;
	}


	public void setInternName(String internName) {
		this.internName = internName;
	}

	public double getInternSalary() {
		return internSalary;
	}


	public void setInternSalary(double internSalary) {
		this.internSalary = internSalary;
	}
	
	@Override
	public String toString() {
		return "Intern [internId=" + internId + ", internName=" + internName + ", internSalary=" + internSalary + "]";
	}
	
	public abstract void addBonus();

}
