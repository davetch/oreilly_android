package com.oreilly.android.taskmanager.tasks;

import java.io.Serializable;

public class Task implements Serializable {
	
	/**
	 * Generated by Eclipse
	 */
	private static final long serialVersionUID = 5527258407135652423L;
	
	private long id;
	private String name;
	private boolean complete;

	public Task(String taskName) {
		name = taskName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public boolean isComplete() {
		return complete;
	}

	public String toString() {
		return name;
	}

	public void toggleComplete() {
		complete = !complete;
	}

}