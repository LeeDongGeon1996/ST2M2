package kw.comso.dao;

import kw.comso.dto.MemberVO;

interface MemberDAO {
	boolean insertMember(MemberVO member);
	boolean updateMember(MemberVO member);
	boolean deleteMember(MemberVO member);

}
 