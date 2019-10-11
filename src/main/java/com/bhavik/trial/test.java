package com.bhavik.trial;

import java.sql.Connection;
import java.sql.DriverManager;

public class test {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/netbanking?useSSl=false&serverTimezone=UTC";
		String user="netbanking";
		String pass="netbanking";
		/*
		 * */
		try {
			System.out.println("Connecting...!");
			
			Connection myConn = DriverManager.getConnection(url,user,pass);
			
			System.out.println("Connection successful!!");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	/*
	 * Timepass
	 * */

}
