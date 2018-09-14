package com.csc205.demos.module5;

import java.util.ArrayList;
import java.util.List;

public class Crate<T extends Box<?>> {

	List<T> items;
	
	public Crate() {
		items = new ArrayList<>();
	}
	
	public List<T> getItems() {
		return items;
	}
	
	public void setItems(List<T> items) {
		this.items = items;
	}
		public void addBox(T box) {
			items.add(box);
	
		}
		public T getBox(int box) {
			return items.get(box);
		}
/*
 * (non-Javadoc)
 * @see java.lang.Object#toString()
 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Crate [items=");
			builder.append(items);
			builder.append("]");
			return builder.toString();
		}
}
