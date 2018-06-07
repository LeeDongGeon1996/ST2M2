package kw.comso.dao;

import kw.comso.dto.TestPaperVO;

public interface TestPaperDAO {
	boolean insertTestPaper(TestPaperVO member);

	boolean updateTestPaper(TestPaperVO member);

	boolean deleteTestPaper(TestPaperVO member);
}
