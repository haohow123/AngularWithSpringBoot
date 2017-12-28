package com.practice.AngularAndSpringBoot.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.AngularAndSpringBoot.entity.Member;
import com.practice.AngularAndSpringBoot.facade.IMemberFacade;
import com.practice.AngularAndSpringBoot.service.IMemberService;

@Component
public class MemberFacade implements IMemberFacade {
	
	@Autowired
	private IMemberService iMemberService;

	@Override
	public List<Member> getAllMemberData() {
		return iMemberService.getAllMemberData();
	}

}
