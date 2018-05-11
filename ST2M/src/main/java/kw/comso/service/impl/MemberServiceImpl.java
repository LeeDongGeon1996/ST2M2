package kw.comso.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import kw.comso.dao.MysqlDAO;
import kw.comso.dto.MemberVO;
import kw.comso.service.MemberService;

public class MemberServiceImpl implements MemberService {

	@Autowired
	MysqlDAO mysqlDAO;
	
	public void setMysqlDAO(MysqlDAO mysqlDAO){
		this.mysqlDAO = mysqlDAO;	
	}
	
	@Override
	public void registerMember() {
		MemberVO member= new MemberVO();
		member.setName("testuser");
		member.setAge(23);
		mysqlDAO.insert(member, "member");
		
	}

}
