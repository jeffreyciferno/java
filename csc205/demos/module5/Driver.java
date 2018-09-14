package com.csc205.demos.module5;

public class Driver {

	public static void main(String[] args) {
	 Box<Integer> box1 = new Box<>();
	 Box<Double> box2 = new Box<>();
	
	 box1.setValue(2);
	 System.out.println(box1);
	 box2.setValue(2.0);
	 System.out.println(box2);
	 
	 box1.serialNumber = 1;
	 box2.serialNumber = 2;
	 Crate<Box> crate1 = new Crate<>();	
	
	crate1.addBox(box1);
	crate1.addBox(box2);
	System.out.println(crate1);
	System.out.println(box1.compareTo(box2));
}
}
