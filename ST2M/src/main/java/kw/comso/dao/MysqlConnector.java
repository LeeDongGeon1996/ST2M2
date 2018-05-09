package kw.comso.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
public class MysqlConnector {

	@Autowired
	private transient static DataSource ds;
	private static Connection connection = null;
	
	public static Connection getConnection() {
		if(MysqlConnector.connection == null) {
			try {
				connection = ds.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return connection;
	}
	
}