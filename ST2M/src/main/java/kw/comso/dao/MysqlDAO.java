package kw.comso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import kw.comso.dto.MemberVO;

public class MysqlDAO {

	private MysqlConnector mysqlConnector;

	public void setMysqlConnector(MysqlConnector mysqlConnector) {
		this.mysqlConnector = mysqlConnector;
	}
	
	public void insert(MemberVO member, String table) {
		String sql = "insert into test.member values(?,?)";
		
		Connection conn = mysqlConnector.getConnection();
		PreparedStatement ps;
		/*
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setInt(2, member.getAge());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/
		
	}
}
