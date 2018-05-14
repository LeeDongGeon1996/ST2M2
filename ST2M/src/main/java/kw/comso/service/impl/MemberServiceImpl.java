package kw.comso.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import kw.comso.dao.MemberDAOImpl;
import kw.comso.dto.MemberVO;
import kw.comso.service.MemberService;

public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAOImpl memberDAO;
	
	public void setMemberDAO(MemberDAOImpl memberDAO){
		this.memberDAO = memberDAO;	
	}
	
	@Override
	public boolean registerMember() {
		MemberVO member= new MemberVO();
		member.setName("testuser");
		member.setAge(23);
		
		return memberDAO.insertMember(member);
		
	}

	@Override
	public boolean deleteMember() {
		MemberVO member= new MemberVO();
		member.setName("testuser");
		member.setAge(23);
		
		return memberDAO.deleteMember(member);
	}

}
