package kw.comso.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;


/*
 * 현재는 싱글톤으로 구현했으나 
 * 나중에 pooling기능이 있는 dataSource클래스를 사용하여 커넥션풀을 이용할 수 있도록 개선해야함.
 * 그리고 JdbcTemplate의 사용을 고려해볼것.
 */
public class MysqlConnector {

	private transient DataSource dataSource;
	private static Connection connection = null;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Connection getConnection() {
		if(MysqlConnector.connection == null) {
			try {
				connection = dataSource.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(connection);
		
		return connection;
	}
	
}