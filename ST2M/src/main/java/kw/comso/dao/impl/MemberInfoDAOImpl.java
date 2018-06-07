package kw.comso.dao.impl;

import javax.sql.DataSource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

import kw.comso.dao.MemberInfoDAO;
import kw.comso.dto.MemberInfoVO;

public class MemberInfoDAOImpl implements MemberInfoDAO{

	private MongoTemplate mongoTemplate;

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	@Override
	public boolean insertMemberInfo(MemberInfoVO member) {
		
		//mongoTemplate.inser
		return false;
	}

	@Override
	public boolean updateMemberInfo(MemberInfoVO member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMemberInfo(MemberInfoVO member) {
		// TODO Auto-generated method stub
		return false;
	}

}
