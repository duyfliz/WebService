package org.vgu.sql;

import java.util.Map;

import org.vgu.uml.UMLContext;

public class SQLJoin implements SQLStatements{

	Map<Integer, UMLContext> schema;
	
	
	public Map<Integer, UMLContext> getSchema() {
		return schema;
	}


	public void setSchema(Map<Integer, UMLContext> schema) {
		this.schema = schema;
	}


	@Override
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}
