package com.mark.beanone;

public class FavVacationSpot {
	private String spot;

	public String getSpot() {
		return spot;
	}

	public void setSpot(String spot) {
		this.spot = spot;
	}

	@Override
	public String toString() {
		return "FavVacationSpot [My favorite vacation spot is " + spot + "]";
	}
	
}
