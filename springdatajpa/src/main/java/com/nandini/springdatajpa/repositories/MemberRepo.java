package com.nandini.springdatajpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nandini.springdatajpa.entities.Member;

@Repository
public interface MemberRepo extends JpaRepository<Member, Integer>{

	Member findByMemberid(Integer memberid);
	List<Member> findByName(String name);
	List<Member> findByJoiningyrGreaterThan(int joiningyr);
}
