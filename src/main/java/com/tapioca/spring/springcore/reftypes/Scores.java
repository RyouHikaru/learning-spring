package com.tapioca.spring.springcore.reftypes;

public class Scores {

	private Double math;
	private Double physics;
	private Double chemistry;

	public Double getMath() {
		return math;
	}

	public void setMath(Double math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Scores [math=" + math + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	public Double getChemistry() {
		return chemistry;
	}

	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}

}
