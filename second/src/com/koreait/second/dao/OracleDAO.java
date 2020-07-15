package com.koreait.second.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDAO {
	//싱글톤 패턴
	private static OracleDAO dao = null;
	
	private OracleDAO() {}
	
	public static OracleDAO getInstance() {
		if(dao == null) {
			dao = new OracleDAO();
		}
		return dao;
	}
	

	public Connection getConn() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		Connection con = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, userName, password);

		System.out.println("접속 성공!!!");
		return con;
	}
	public void closeCon(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {}
		}
		
	}
}
