package tqcfx.gui;

import javafx.beans.property.SimpleStringProperty;

public class functionality_req {
	private SimpleStringProperty functionality_name, requirement;
	private int ID;

	public functionality_req(String functionality_name, String requirement, Integer ID) {
		this.functionality_name = new SimpleStringProperty(functionality_name);
		this.ID = ID;
		this.requirement = new SimpleStringProperty(requirement);
	}


	public String getFunctionality_name() {
		return functionality_name.get();
	}

	public void setFunctionality_name(SimpleStringProperty functionality_name) {
		this.functionality_name = functionality_name;
	}

	public String getRequirement() {
		return requirement.get();
	}

	public void setRequirement(SimpleStringProperty requirement) {
		this.requirement = requirement;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
	
	
}
