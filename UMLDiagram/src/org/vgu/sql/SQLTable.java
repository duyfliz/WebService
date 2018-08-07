package org.vgu.sql;

import java.util.ArrayList;
import java.util.List;

import org.vgu.uml.UMLContext;

public class SQLTable {
	private String name;
	private List<SQLColumn> columns;
	private SQLColumn primaryKey;
	private List<SQLForeignKey> foreignKeys;
	private UMLContext umlContext;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SQLColumn> getColumns() {
		return columns;
	}
	public void setColumns(List<SQLColumn> columns) {
		this.columns = columns;
	}
	public SQLColumn getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(SQLColumn primaryKey) {
		this.primaryKey = primaryKey;
	}
	public List<SQLForeignKey> getForeignKeys() {
		return foreignKeys;
	}
	public void setForeignKeys(List<SQLForeignKey> foreignKeys) {
		this.foreignKeys = foreignKeys;
	}
	public UMLContext getUmlContext() {
		return umlContext;
	}
	public void setUmlContext(UMLContext umlContext) {
		this.umlContext = umlContext;
	}
}