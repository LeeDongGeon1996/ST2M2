package kw.comso.dao;

import java.util.ArrayList;
import java.util.Hashtable;

import kw.comso.dto.TestPaperVO;

public interface TestPaperDAO {
	boolean insertTestPaper(TestPaperVO testPaper);

	boolean updateTestPaper(TestPaperVO testPaper, Hashtable<String, Object> updatedVal);

	boolean removeTestPaper(TestPaperVO testPaper);

	TestPaperVO findOne(String key, Object value, String[] fields);

	ArrayList<TestPaperVO> findAll(String key, Object value, String[] fields);
}
