package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additicionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additicionalCharge) {
		super(name, hours, valuePerHour);
		this.additicionalCharge = additicionalCharge;
	}

	public Double getAdditicionalCharge() {
		return additicionalCharge;
	}

	public void setAdditicionalCharge(Double additicionalCharge) {
		this.additicionalCharge = additicionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additicionalCharge * 1.1;
	}
	

}
