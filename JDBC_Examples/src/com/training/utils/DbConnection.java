package com.training.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getOracleConnection() {
		Connection con=null;
		
		try {
			//jdbc:oracle:thin:1521:XEPDB1
			//jdbc:oracle:thin:@localhost:1521:xe
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","hr","hr");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return con;
		
	}
	
	
}
