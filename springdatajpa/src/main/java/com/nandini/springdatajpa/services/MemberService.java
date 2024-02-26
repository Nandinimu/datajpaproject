package com.nandini.springdatajpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandini.springdatajpa.entities.Member;
import com.nandini.springdatajpa.repositories.MemberRepo;

@Service
public class MemberService {

	@Autowired
	private MemberRepo memberRepo;

	public Member addNewMember(Member member) {
		return memberRepo.save(member);
	}

	public List<Member> searchMember(String name) {
		return memberRepo.findByName(name);

	}

	public List<Member> searchMemberByYr(int joiningyr) {
		return memberRepo.findByJoiningyrGreaterThan(joiningyr);
	}

	public Member updateMobileNo(int memberid, String mobile) {
		Member obj = memberRepo.findByMemberid(memberid);
		obj.setMobile(mobile);
		return memberRepo.save(obj);
	}
}
