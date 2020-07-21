package com.koreait.second.test;

import java.sql.*;

public class OracleDAO {

	private OracleDAO() {}
	
	private static OracleDAO dao = null;
	
	public static OracleDAO getInstance() {
		if(dao == null) {
			dao = new OracleDAO();
		}
		return dao;
	}
	
	public Connection getConn() throws Exception{
		Connection con = null;
		String url = "";
		String userName = "hr";
		String password = "koreait2020";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, userName, password);
		System.out.println("접속 성공!");
		
		return con;
	}
	
	public void closeConn(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
