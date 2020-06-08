package jsf_ajax;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="num")
public class NumberGenerator {
	private double number = Math.random();
	private double range = 1;
	public NumberGenerator() {
		// TODO Auto-generated constructor stub
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public void randomize() {
		number = range * Math.random();
	}

}
