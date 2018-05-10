package kw.comso.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;


/*
 * ����� �̱������� ���������� 
 * ���߿� pooling����� �ִ� dataSourceŬ������ ����Ͽ� Ŀ�ؼ�Ǯ�� �̿��� �� �ֵ��� �����ؾ���.
 * �׸��� JdbcTemplate�� ����� ����غ���.
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