package kw.comso.dao.impl;

import org.springframework.data.mongodb.core.MongoTemplate;

import kw.comso.dao.QuestionDAO;
import kw.comso.dto.QuestionVO;

public class QuestionDAOImpl implements QuestionDAO{

	private MongoTemplate mongoTemplate;

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	@Override
	public boolean insertQuestion(QuestionVO member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateQuestion(QuestionVO member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteQuestion(QuestionVO member) {
		// TODO Auto-generated method stub
		return false;
	}

}
