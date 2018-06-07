package kw.comso.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import kw.comso.dto.MemberInfoVO;
import kw.comso.dto.MemberVO;

/*
 * �׳� String�� ������ sql�� �ۼ��Ͽ� ���ڷ� �ѱ���,
 * �ƴϸ� PreparedStatementCreator�� ����Ͽ� PreparedStatement���·� sql�� �ѱ��� �𸣰���.
 * ��Ȳ������ �ٸ��ٰ��ϴµ� (���� sql���� �ݺ��Ǿ� ���� �� �ʿ䰡 ������ �����) ������ ���ϰ���.
 */
public class JunmantestDAOImpl implements JunmantestDAO {

	private MongoTemplate mongoTemplate;

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public boolean insertMember(final MemberInfoVO member) {

		this.mongoTemplate.insert(member, "member");
		
		return true;
	}

	public boolean removeMember(final MemberInfoVO member) {

		this.mongoTemplate.remove(member, "member");
		
		return true;
	}
}
