package com.csc205.activities.activity5;
/**
 * @author Ryan Callaghan
 * @author Jeffrey Ciferno
 */


public class Fruit {
final private String fruitName;
final private String fruitDesc;
final  private int fruitQty;

Fruit (String fruitName, String fruitDesc, int fruitQty) {

}

public String getFruitName() {
	return fruitName;
}
public void setFruitName(String fruitName) {
	fruitName = this.fruitName;
}
public String getFruitDesc() {
	return fruitDesc;
}
public void setFruitDesc(String fruitDesc) {
	fruitDesc = this.fruitDesc;
}
public int getFruitQty() {
	return fruitQty;
}
public void setFruitQty(int fruitQty) {
	fruitQty = this.fruitQty;
}

public int compareTo(Fruit o){
	 
	
		if(o.fruitName.compareTo(o.fruitName) < 0) {
			return -1;
		} else if(o.fruitName.compareTo(o.fruitName) > 0 ) {
			return 1;
		} else {
			
			if(this.fruitQty < o.fruitQty) {
				return -1;
			} else if(this.fruitQty < o.fruitQty) {
				return 1;
			} else {
				return 0;
		}
			
		}

}}


