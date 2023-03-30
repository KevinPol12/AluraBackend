package com.alura.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {

	public static void main(String[] args) {
		
		final String DATABASE_URL= "jdbc:mysql://localhost/control_de_Stock"; //?useTimeZone=true&serverTimeZone=UTC

		try {
			Connection con = DriverManager.getConnection(DATABASE_URL,"root","root");
			
			System.out.println("hello");
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//End main
	
}
