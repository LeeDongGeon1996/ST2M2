package kw.comso.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kw.comso.service.MemberService;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/inserttest", method = RequestMethod.GET)
	public String dbInsertTest(Model model) {
		boolean is = false;
		is = memberService.registerMember();
	
		model.addAttribute("serverTime", is);		
		return "home";
	}
	
	@RequestMapping(value = "/deletetest", method = RequestMethod.GET)
	public String dbDeleteTest(Model model) {
		boolean is = false;
		is = memberService.deleteMember();
	
		model.addAttribute("serverTime", is);		
		return "home";
	}
	
	
	@RequestMapping(value = "/dbtest", method = RequestMethod.GET)
	public String dbConnectionTest(Model model) {
		
		boolean is = false;
		is = memberService.registerMember();
	
		model.addAttribute("serverTime", is);		
		return "home";
	}
	
	
	@RequestMapping(value = "/tl", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		//mysqlConnector.getConnection();
		
		return "home";
	}
	
	
}
