package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connect.DBConnect;


public class UserDAO {
	Connection con = null;
	DBConnect db = new DBConnect();
	public boolean checkExistedUser(String usernameXXX) throws Exception {
		
		try {
			con = db.getConnection();
			Statement stmt = con.createStatement();
			String query = "SELECT username FROM newsservlet.user where username = '" + usernameXXX + "'";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String username = rs.getString(1);
				System.out.println(username + "aa");
				if (username.equals(usernameXXX)) {
					return true;
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public boolean checkPassword(String username, String pass) {
		
		try {
			con = db.getConnection();
			Statement stmt = con.createStatement();
			String sql = "SELECT password FROM newsservlet.user where username = '" + username + "'";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String password = rs.getString(1);
				if (pass.equals(password)) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
