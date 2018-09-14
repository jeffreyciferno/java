package com.csc205.projects.project3;
/**
 * Method MowLawn, extends command Task
 * @author Jeffrey Ciferno
 *
 */
public class MowLawn extends Task{
/**
 * 	ExecutesTask, overrides executesTask in Task
 */
	public void executeTask() {
		System.out.println("Mowing lawn...");
	}
}
