package kw.comso.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import kw.comso.dao.MemberDAO;
import kw.comso.dto.MemberVO;


/*
 * �׳� String�� ������ sql�� �ۼ��Ͽ� ���ڷ� �ѱ���,
 * �ƴϸ� PreparedStatementCreator�� ����Ͽ� PreparedStatement���·� sql�� �ѱ��� �𸣰���.
 * ��Ȳ������ �ٸ��ٰ��ϴµ� (���� sql���� �ݺ��Ǿ� ���� �� �ʿ䰡 ������ �����) ������ ���ϰ���.
 */
public class MemberDAOImpl implements MemberDAO {

	private MongoTemplate mongoTemplate;
	private JdbcTemplate jdbctemplate;
 
	public void setDataSource(DataSource dataSource) {
		this.jdbctemplate = new JdbcTemplate(dataSource);	
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	
	@Override
	public boolean insertMember(final MemberVO member) {
		
		String sql = "INSERT INTO test.member values(?,?)";
		
		this.mongoTemplate.insert(member, "member");
		
		return true;
		
	}

	@Override
	public boolean updateMember(MemberVO member) {
		
		return false;
	}

	@Override
	public boolean deleteMember(final MemberVO member) {
		String sql = "DELETE FROM test.member WHERE player_name = ?";
		
		return this.jdbctemplate.update(sql, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, member.getName());
				
			}}) > 0 ? true : false;
	}
	
	
}
