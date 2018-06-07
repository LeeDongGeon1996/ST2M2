package kw.comso.dao;

import kw.comso.dto.QuestionVO;

public interface QuestionDAO {
	boolean insertQuestion(QuestionVO member);

	boolean updateQuestion(QuestionVO member);

	boolean deleteQuestion(QuestionVO member);
}
