package io.javabrains.action;

import com.opensymphony.xwork2.ActionSupport;

public class SaveAction extends ActionSupport{
	
	private String description;
	
	public String execute() {		
		System.out.println(getDescription());
		return SUCCESS;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
