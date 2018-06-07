package kw.comso.dao.impl;

import java.util.Hashtable;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.WriteResult;

import kw.comso.dao.MemberRelationDAO;
import kw.comso.dto.MemberRelationVO;

public class MemberRelationDAOImpl implements MemberRelationDAO{

	private MongoTemplate mongoTemplate;
	private static final String TABLE_NAME = "MemberRelation";

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	@Override
	public boolean insertMemberRelation(MemberRelationVO memberRelation) {
		
		mongoTemplate.insert(memberRelation, TABLE_NAME);
		
		return true;
	}

	@Override
	public boolean updateMemberRelation(MemberRelationVO memberRelation, Hashtable<String, String> updatedVal) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(memberRelation.getEmail()));
		//query.fields().include("email");
		
		Update update = new Update();
		
		for(String key : updatedVal.keySet()) {
			update.set(key, updatedVal.get(key));
		}
		
		mongoTemplate.updateFirst(query, update, TABLE_NAME);
		
		return true;
	}

	@Override
	public boolean deleteMemberRelation(MemberRelationVO memberRelation) {
		
		mongoTemplate.remove(memberRelation, TABLE_NAME);
		
		return true;
	}

}
