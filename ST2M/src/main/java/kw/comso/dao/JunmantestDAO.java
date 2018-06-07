package kw.comso.dao;

import kw.comso.dto.MemberInfoVO;

interface JunmantestDAO{
	boolean insertMember(MemberInfoVO member);
	boolean removeMember(MemberInfoVO member);
}
