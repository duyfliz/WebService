package org.vgu.uml;

public class UMLAssociation {
	private UMLAssociationEnd source;
	private UMLAssociationEnd target;
	private boolean check;
	
	public UMLAssociationEnd getSource() {
		return source;
	}
	public void setSource(UMLAssociationEnd source) {
		this.source = source;
	}
	public UMLAssociationEnd getTarget() {
		return target;
	}
	public void setTarget(UMLAssociationEnd target) {
		this.target = target;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	
	

}
