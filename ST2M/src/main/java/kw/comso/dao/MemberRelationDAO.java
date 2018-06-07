package kw.comso.dao;

import kw.comso.dto.MemberRelationVO;

public interface MemberRelationDAO {
	boolean insertMemberRelation(MemberRelationVO member);

	boolean updateMemberRelation(MemberRelationVO member);

	boolean deleteMemberRelation(MemberRelationVO member);
}
