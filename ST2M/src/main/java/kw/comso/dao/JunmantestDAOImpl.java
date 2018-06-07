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
 * 그냥 String형 변수에 sql을 작성하여 인자로 넘길지,
 * 아니면 PreparedStatementCreator를 사용하여 PreparedStatement형태로 sql을 넘길지 모르겟음.
 * 상황에따라 다르다고하는데 (같은 sql문이 반복되어 실행 될 필요가 있을때 라던지) 구분을 못하겠음.
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
