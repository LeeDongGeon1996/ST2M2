package kw.comso.dao.impl;

import kw.comso.dao.MemberInfoDAO;
import kw.comso.dto.MemberInfoVO;

import org.springframework.data.mongodb.core.MongoTemplate;

public class MemberInfoDAOImpl implements MemberInfoDAO{

	MongoTemplate mongoTemplate;
	
	@Override
	public boolean insertMemberInfo(MemberInfoVO member) {
		this.mongoTemplate.insert(member, "member");
		
		return true;
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
