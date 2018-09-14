package com.csc205.projects.project3;
/**
 * Abstract method Task, Implements PrioritizedTask and overrides it
 * @author Jeffrey Ciferno
 *
 */
public abstract class Task implements PrioritizedTask {
/**
 * Final Integer priority
 */
final int priority = 0;
/**
 * getPriority, retreives priority and returns
 */
public int getPriority() {
	return priority;
}
/**
 * setPriority, mutates priority based on override
 */
public void setPriority(int priority) {
priority = this.priority;
}	
/**
 * abstract ExecutesTask, excutes command of a certain method extended by Task
 */
public abstract void executeTask();
}
