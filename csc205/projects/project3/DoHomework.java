package com.csc205.projects.project3;
/**
 * Method DoHomework, extends command Task
 * @author Jeffrey Ciferno
 *
 */
public class DoHomework extends Task {
/**
 * ExecutesTask, overrides executesTask in Task
 */
	public void executeTask() {
		System.out.println("Doing homework...");
	}
}
