package org.vgu.uml;

public class UMLAssociationEnd {
	
	private String name;
	private UMLClass source;
	private UMLClass target;
	
	public UMLClass getSource() {
		return source;
	}
	public void setSource(UMLClass source) {
		this.source = source;
	}
	public UMLClass getTarget() {
		return target;
	}
	public void setTarget(UMLClass target) {
		this.target = target;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
