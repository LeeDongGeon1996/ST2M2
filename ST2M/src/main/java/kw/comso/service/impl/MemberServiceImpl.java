package kw.comso.service.impl;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;

import kw.comso.dao.MemberRelationDAO;
import kw.comso.dao.impl.MemberDAOImpl;
import kw.comso.dao.impl.MemberRelationDAOImpl;
import kw.comso.dto.MemberRelationVO;
import kw.comso.dto.MemberVO;
import kw.comso.service.MemberService;

public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAOImpl memberDAO;
	
	@Autowired
	MemberRelationDAO memberRelationDAO;
	
	public void setMemberDAO(MemberDAOImpl memberDAO){
		this.memberDAO = memberDAO;	
	}
	
	public void setMemberRelationDAO(MemberRelationDAO memberRelationDAO){
		this.memberRelationDAO = memberRelationDAO;
	}
	
	@Override
	public boolean registerMember() {
		MemberVO member= new MemberVO();
		member.setName("testuser");
		member.setAge(23);
		
		MemberRelationVO memrel = new MemberRelationVO();
		memrel.setEmail("matth1996@naver.com");
		memrel.setMyTeacher("이동건");
		memberRelationDAO.insertMemberRelation(memrel);
		
		
		return memberDAO.insertMember(member);
		
	}

	@Override
	public boolean deleteMember() {
		MemberVO member= new MemberVO();
		member.setName("testuser");
		member.setAge(23);
		
		return memberDAO.deleteMember(member);
	}

	@Override
	public boolean updateMember() {
		// TODO Auto-generated method stub
	
		MemberVO member= new MemberVO();
		member.setName("testuser");
		member.setAge(23);
		
		MemberRelationVO memrel = new MemberRelationVO();
		memrel.setEmail("matth1996@gmail.com");
		memrel.setMyTeacher("건동이");
		
		Hashtable<String, String> update = new Hashtable<String, String>();
		update.put("email", memrel.getEmail());
		update.put("myTeacher", memrel.getMyTeacher());
		
		return memberRelationDAO.updateMemberRelation(memrel, update);
		
	}

}
