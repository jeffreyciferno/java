package com.csc205.projects.project3;
/**
 * Method ReadBook, extends command Task
 * @author Jeffrey Ciferno
 *
 */
public class ReadBook extends Task{
/**
 * ExecutesTask, overrides executesTask in Task
 */
	public void executeTask() {
		System.out.println("Reading book...");
	}
/**
 * Method browseLibrary, local class method can be called
 */
	public void browseLibrary() {
		System.out.println("Browsing library...");
	}
}
