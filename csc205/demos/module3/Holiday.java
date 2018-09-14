package com.csc205.demos.module3;

import java.time.LocalDate;

public abstract class Holiday implements Celebratable, Decoratable{

	LocalDate date;
 
 public Holiday() {
	 
 }
 
 public void decorate()
 {
	 System.out.println("Default decorations applied");
 }

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}


}
