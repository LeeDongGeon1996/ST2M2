package kw.comso.dao.impl;

import javax.sql.DataSource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

import kw.comso.dao.MemberInfoDAO;
import kw.comso.dto.MemberInfoVO;

import org.springframework.data.mongodb.core.MongoTemplate;

public class MemberInfoDAOImpl implements MemberInfoDAO{

<<<<<<< HEAD
	MongoTemplate mongoTemplate;
=======
	private MongoTemplate mongoTemplate;

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
>>>>>>> refs/remotes/origin/dao_update_구현
	
	@Override
	public boolean insertMemberInfo(MemberInfoVO member) {
<<<<<<< HEAD
		this.mongoTemplate.insert(member, "member");
		
		return true;
=======
		
		//mongoTemplate.inser
		return false;
>>>>>>> refs/remotes/origin/dao_update_구현
	}

	@Override
	public boolean updateMemberInfo(MemberInfoVO member) {
		return false;
	}

	@Override
	public boolean removeMemberInfo(MemberInfoVO member) {
		this.mongoTemplate.remove(member, "member");
		
		return true;
	}

}
