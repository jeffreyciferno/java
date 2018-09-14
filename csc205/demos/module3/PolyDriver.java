package com.csc205.demos.module3;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class PolyDriver {

	public static void main(String[] args) {
		//part1 
		Christmas christmas1 = new Christmas();
		Easter easter1 = new Easter();
		Halloween halloween1 = new Halloween();
		christmas1.celebrate();
		easter1.celebrate();
		halloween1.celebrate();
		
		System.out.println();
		
		//part2
		Holiday christmas2 = new Christmas();
		Holiday easter2 = new Easter();
		Holiday halloween2 = new Halloween();
		List<Holiday> holidayList = new ArrayList<>();
		holidayList.add(christmas2);
		holidayList.add(easter2);
		holidayList.add(halloween2);
		
		christmas2.date = LocalDate.of(2018,Month.DECEMBER, 25);
		easter2.date = LocalDate.of(2018,Month.APRIL, 1);
		halloween2.date = LocalDate.of(2018,Month.OCTOBER, 31);
		
		for (Holiday h : holidayList) {
			h.celebrate(); //polymorphic method call
			System.out.println(h.date);
			h.decorate();  //polymorphic method call
		
		if (h instanceof Easter) {
			((Easter)h).findEggs();
		}
		System.out.println("------");
		}
		System.out.println();
		
		//part 3
		//use of interfaces
		Celebratable christmas3 = new Christmas();
		Celebratable easter3 = new Easter();
		Celebratable halloween3 = new Halloween();
		List<Celebratable> holidayList2 = new ArrayList<>();
		holidayList2.add(christmas3);
		holidayList2.add(easter3);
		holidayList2.add(halloween3);
		
		holidayList2.forEach(Celebratable::celebrate);
		
		System.out.println();
		
		//part 4
		// use of default method
		
		Decoratable christmas4 = new Christmas();
		christmas4.cleanup();
		
	}

}
