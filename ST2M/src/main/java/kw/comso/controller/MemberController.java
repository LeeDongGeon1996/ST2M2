package kw.comso.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kw.comso.service.MemberService;
import kw.comso.dto.*;
@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;
	
	
	//시험지 에디터
	@RequestMapping(value="testeditor",method=RequestMethod.GET)
	public String testeditor() {
		
		return "editor1";
	}
	
	//로그인 화면
	@RequestMapping(value="/insertinfo",method=RequestMethod.GET)
	public String insertinfo(ModelMap modelMap) {
		//VO 객체생성
		MemberInfoVO infoVO=new MemberInfoVO();
		//Model에 VO객체 전달
		modelMap.addAttribute("infoVO",infoVO);
		
		return "signupform";
	}
	
	//메인화면
	@RequestMapping(value="/getinfo",method= {RequestMethod.POST,RequestMethod.GET})
	public String getinfo(MemberInfoVO infoVO,ModelMap modelMap) {
		boolean is;
		
		
		modelMap.addAttribute("name",infoVO.getName());
		modelMap.addAttribute("password",infoVO.getPassword());
		is = memberService.registerMember(infoVO);
		System.out.println(is);
		
		

		System.out.println("id=" + infoVO.getName());
		System.out.println("pw=" + infoVO.getPassword());
		return "home";
	}
}

