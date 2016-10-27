package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelloBean {
	
	Connection connection;
	
	public HelloBean() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug2016","root","password");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * @param con the con to set
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	
	

}
