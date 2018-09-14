package com.csc205.demos.module5;

import java.io.Serializable;

public class Box<T extends Comparable<T>> implements Serializable, Comparable<Box<?>>{
	
	
	T value;
	int serialNumber;
	
	public Box() {
		
	}


	public T getValue() {
		return value;
	}


	public void setValue(T value) {
		this.value = value;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int compareTo(Box<?> box) {
	int thisSn = this.serialNumber;
	int thatSn = box.serialNumber;
	if(thatSn < thisSn ) {
		return -1;
	} else if(thatSn < thisSn ) {
		return -1;
	} else {
		
	T thisT = this.value;
	T thatT = (T) box.value;
		if(thatT.compareTo(thisT)== -1) {
			return -1;
		} else if(thatT.compareTo(thisT)== 1) {
			return 1;
		} else {
			return 0;
	}
		
	}

	}}
