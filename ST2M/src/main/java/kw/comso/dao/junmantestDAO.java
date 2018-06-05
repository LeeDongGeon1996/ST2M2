package kw.comso.dao;

import kw.comso.dto.MemberInfoVO;

interface junmantestDAO{
	boolean insertMember(MemberInfoVO member);
	boolean deleteMember(MemberInfoVO member);
}
