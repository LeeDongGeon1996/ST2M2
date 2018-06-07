package kw.comso.dao;

import java.util.Hashtable;

import kw.comso.dto.MemberRelationVO;

public interface MemberRelationDAO {
	boolean insertMemberRelation(MemberRelationVO member);

	boolean updateMemberRelation(MemberRelationVO member, Hashtable<String, String> updatedVal);

	boolean deleteMemberRelation(MemberRelationVO member);
}
