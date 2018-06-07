package kw.comso.dao.impl;

import org.springframework.data.mongodb.core.MongoTemplate;

import kw.comso.dao.TestPaperDAO;
import kw.comso.dto.TestPaperVO;

public class TestPaperDAOImpl implements TestPaperDAO{

	private MongoTemplate mongoTemplate;

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	@Override
	public boolean insertTestPaper(TestPaperVO member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTestPaper(TestPaperVO member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTestPaper(TestPaperVO member) {
		// TODO Auto-generated method stub
		return false;
	}

}
