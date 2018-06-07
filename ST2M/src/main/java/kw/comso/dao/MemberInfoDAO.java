package kw.comso.dao;

import kw.comso.dto.MemberInfoVO;

public interface MemberInfoDAO {
	boolean insertMemberInfo(MemberInfoVO member);

	boolean updateMemberInfo(MemberInfoVO member);

	boolean deleteMemberInfo(MemberInfoVO member);
}
