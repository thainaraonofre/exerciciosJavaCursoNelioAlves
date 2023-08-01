package entities;

public class Individual extends Contributors {
	
	private Double healthExpenditures;

	public Individual() {
	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax(){		
		if (super.getAnnualIncome() > 2000.0 && healthExpenditures > 0.1) {
			return ((25.0 / 100.0) * super.getAnnualIncome()) - ((50.0/ 100.0) * healthExpenditures);
		}
			else {
				return ((15.0 / 100.0) * super.getAnnualIncome()) - ((50.0/ 100.0) * healthExpenditures);
	}
		
		
		}
	


	
	
	

}
