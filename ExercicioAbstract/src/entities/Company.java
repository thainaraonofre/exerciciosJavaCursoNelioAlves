package entities;

public class Company extends Contributors{
	
	private Integer numberOfEmployees;

	public Company() {
	}

	public Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if (numberOfEmployees > 10) {
			return ((14.0 / 100.0) * super.getAnnualIncome());
		}
		else 
			return ((16.0 / 100.0) * super.getAnnualIncome());
	}
	
	
}
