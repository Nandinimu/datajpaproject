package com.nandini.springdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nandini.springdatajpa.entities.Member;
import com.nandini.springdatajpa.services.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	@GetMapping("addmember")
	public String addMember() {
		return "NewMember.jsp";
	}

	@PostMapping("addnewmember")
	public String addNewMember(Member member) {
		memberService.addNewMember(member);
		return "Success.jsp";
	}

	@PostMapping("searchMembername")
	public ModelAndView searchMemberByName(String name) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SearchResultOnMemberName.jsp");
		List<Member> list = memberService.searchMember(name);
		mv.addObject("lst", list);
		return mv;
	}

	@PostMapping("searchMemberyear")
	public ModelAndView searchMemberByYear(int joiningyr) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SearchResultOnJoiningYr.jsp");
		List<Member> list = memberService.searchMemberByYr(joiningyr);
		mv.addObject("lst", list);
		return mv;
	}

	@GetMapping("updatemob")
	public String updateMob() {
		return "ModifyMobileNum.jsp";
	}

	@PostMapping("updatemobile")
	public String updateNumber(int memberid, String mobile) {
		memberService.updateMobileNo(memberid, mobile);
		return "Success.jsp";
	}
}
