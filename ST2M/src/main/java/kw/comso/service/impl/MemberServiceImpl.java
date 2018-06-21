package kw.comso.service.impl;

import java.util.Calendar;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;

import kw.comso.dao.MemberInfoDAO;
import kw.comso.dao.MemberRelationDAO;
import kw.comso.dao.impl.MemberDAOImpl;
import kw.comso.dao.impl.MemberRelationDAOImpl;
import kw.comso.dto.MemberInfoVO;
import kw.comso.dto.MemberRelationVO;
import kw.comso.dto.MemberVO;
import kw.comso.service.MemberService;

public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAOImpl memberDAO;

	@Autowired
	MemberInfoDAO memberInfoDAO;

	@Autowired
	MemberRelationDAO memberRelationDAO;

	public void setMemberDAO(MemberDAOImpl memberDAO) {
		this.memberDAO = memberDAO;
	}

	public void setMemberInfoDAO(MemberInfoDAO memberInfoDAO) {
		this.memberInfoDAO = memberInfoDAO;
	}

	public void setMemberRelationDAO(MemberRelationDAO memberRelationDAO) {
		this.memberRelationDAO = memberRelationDAO;
	}

	@Override
	public boolean registerMember(MemberInfoVO member) {

		MemberInfoVO dup = this.memberInfoDAO.findOne("email", member.getEmail());
		if(dup != null)
			return false;
		
		return memberInfoDAO.insertMemberInfo(member);

	}

	@Override
	public boolean deleteMember(MemberInfoVO member) {

		return memberInfoDAO.removeMemberInfo(member);
	}

	// public boolean updateMemberInfo()

	@Override
	public boolean updateMember(MemberInfoVO member) {

		return true;
		// return memberRelationDAO.updateMemberRelation(memrel, update2);

	}

}
