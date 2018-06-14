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
	
	public void setMemberDAO(MemberDAOImpl memberDAO){
		this.memberDAO = memberDAO;	
	}
	
	public void setMemberInfoDAO(MemberInfoDAO memberInfoDAO){
		this.memberInfoDAO = memberInfoDAO;
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
		memrel.setMyTeacher("ÀÌµ¿°Ç");
		memberRelationDAO.insertMemberRelation(memrel);
		
		   
		MemberInfoVO meminfo = new MemberInfoVO();
		meminfo.setAddress("±¤¿î´ë");
		meminfo.setAuth("¼±»ý´Ô");
		Calendar birth = Calendar.getInstance();
		birth.set(1996, 10, 12);
		meminfo.setBirth(birth);
		meminfo.setEmail("test@gmail.com");
		memberInfoDAO.insertMemberInfo(meminfo);
		
		return memberDAO.insertMember(member);
		
	}

	@Override
	public boolean deleteMember() {
		MemberVO member= new MemberVO();
		member.setName("testuser");
		member.setAge(23);
		
		return memberDAO.deleteMember(member);
	}

	//public boolean updateMemberInfo()
	
	@Override
	public boolean updateMember() {
		// TODO Auto-generated method stub
	
		MemberVO member= new MemberVO();
		member.setName("testuser");
		member.setAge(23);
		
		   
		MemberInfoVO meminfo = new MemberInfoVO();
		meminfo.setAddress("±¤¿î´ë");
		meminfo.setAuth("¼±»ý´Ô");
		Calendar birth = Calendar.getInstance();
		birth.set(2000, 1, 5);
		meminfo.setBirth(birth);
		meminfo.setEmail("test@gmail.com");
		
		Hashtable<String, Object> update1 = new Hashtable<String, Object>();
		update1.put("email", meminfo.getEmail());
		update1.put("birth", meminfo.getBirth());
		memberInfoDAO.updateMemberInfo(meminfo, update1);
		
		
		
		MemberRelationVO memrel = new MemberRelationVO();
		memrel.setEmail("matth1996@naver.com");
		memrel.setMyTeacher("°Çµ¿ÀÌ");
		
		Hashtable<String, Object> update2 = new Hashtable<String, Object>();
		update2.put("email", memrel.getEmail());
		update2.put("myTeacher", memrel.getMyTeacher());
		
		return memberRelationDAO.updateMemberRelation(memrel, update2);
		
	}

}
