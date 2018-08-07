package org.vgu.parse;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.Map;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParser;
import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.vgu.sql.SQLCreateFunction;

public class TestProcedure {
	public void test() throws JSQLParserException, FileNotFoundException, IOException, ParseException {
		CCJSqlParserManager parserManager = new CCJSqlParserManager();
		String statement = "SELECT family_name, middle_name, given_name FROM reg_user\r\n" + 
				"		INNER JOIN student\r\n" + 
				"		ON reg_user_id = student_id;";
		Select select = (Select) parserManager.parse(new StringReader(statement));
		PlainSelect plainSelect = (PlainSelect) select.getSelectBody();
			
//		Iterator iterator = jsonArray.iterator();
//		while(iterator.hasNext()) {
//			Iterator<Map.Entry> i = ((Map) iterator.next()).entrySet().iterator();
//			while(i.hasNext()) {
//				Map.Entry pair = i.next();
//				System.out.println(pair.getKey() + " " + pair.getValue());
//			}
//			JSONObject inner = (JSONObject) iterator.next();
//			if(inner.get("check").equals(true)) {
//				System.out.println("OK");
//			} else {
//				System.out.println("Not OK");
//			}
		
	}
	
	/*Function for the creation of an SQL function*/
	public SQLCreateFunction createSQL(JSONArray policy, int role, String property) {
		Iterator i = policy.iterator();
		String s = "";
		while(i.hasNext()) {
			JSONObject object = (JSONObject) i.next();
			Long integer = (long) role;
			SQLCreateFunction function = new SQLCreateFunction();
			if(object.get("role").equals(integer) && object.get("property").equals(property)) {
				function.setName("auth_read_name_admin");
				function.setParameters("selft_id int, caller_id int");
				function.setDeclareVariables("var=INTEGER");
				function.setReturnType("INTEGER");
				function.setReturnValue("var");
				if(object.get("check").equals(true)) {
					function.setSetVariables("var=1");
				} else {
					function.setSetVariables("var=0");
				}
			}
			
			return function;
		}
		return null;
	}
	
	public static void main(String[] args) throws JSQLParserException, FileNotFoundException, IOException, ParseException {
		TestProcedure testProcedure = new TestProcedure();
		Object obj = new JSONParser().parse(new FileReader("E:\\Nam 3\\Thesis\\policy.json"));
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) jsonObject.get("data");
		SQLCreateFunction sql = testProcedure.createSQL(jsonArray, 1, "given_name");
		System.out.println(sql.toString());
	}
}
