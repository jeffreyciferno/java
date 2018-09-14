package com.csc205.demos.module1;

import java.awt.Color;

public class Car {

	Color color;
	boolean running;
	Integer milage;

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the running
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * @param running
	 *            the running to set
	 */
	public void setRunning(boolean running) {
		this.running = running;
	}

	/**
	 * @return the milage
	 */
	public Integer getMilage() {
		return milage;
	}

	/**
	 * @param milage
	 *            the milage to set
	 */
	public void setMilage(Integer milage) {
		this.milage = milage;
	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [color=");
		builder.append(color);
		builder.append(", running=");
		builder.append(running);
		builder.append(", milage=");
		builder.append(milage);
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append("]");
		return builder.toString();
	}

}
