package kw.comso.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import kw.comso.dto.MemberInfoVO;


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
	
	
	
}
