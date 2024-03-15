package tqcfx.gui;

import javafx.beans.property.SimpleStringProperty;


public class set_functionality {
	
	public String getVariables() {
		return variables.get();
	}
	public void setVariables(SimpleStringProperty variables) {
		this.variables = variables;
	}
	public String getConstraint() {
		return constraint.get();
	}
	public void setConstraint(SimpleStringProperty constraint) {
		this.constraint = constraint;
	}
	public Integer getInputIO() {
		return InputIO;
	}
	public void setInputIO(Integer inputIO) {
		InputIO = inputIO;
	}
	public Integer getOutputIO() {
		return OutputIO;
	}
	public void setOutputIO(Integer outputIO) {
		OutputIO = outputIO;
	}
	
	
	
	
	
	private SimpleStringProperty variables,constraint;
	private Integer InputIO, OutputIO;
	public set_functionality(String variables, String constraint, Integer inputIO,
			Integer outputIO) {
		super();
		this.variables = new SimpleStringProperty(variables);
		this.constraint = new SimpleStringProperty(constraint);
		this.InputIO = inputIO;
		this.OutputIO = outputIO;
	}
	
	
	
	

}
