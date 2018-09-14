package com.csc205.projects.project3;
/**
 *  Interface Prioritized Task implemented by task
 *  
 * @author Jeffrey Ciferno
 *
 */
public interface PrioritizedTask {
/**
 * Abstract method that returns priority
 * @return
 */
public abstract int getPriority(); 
	
/**
 * Abstract method setPriority, sets the priority integer, set as base default
 * @param priority
 */
public abstract void setPriority(int priority);

	
}
