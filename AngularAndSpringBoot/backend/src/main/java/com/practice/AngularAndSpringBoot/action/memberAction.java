package com.practice.AngularAndSpringBoot.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.AngularAndSpringBoot.entity.Member;
import com.practice.AngularAndSpringBoot.facade.IMemberFacade;

@RestController
@RequestMapping("/Member")
public class memberAction {
	
	@Autowired
	private IMemberFacade iMemberFacade;
	
	@RequestMapping(value="/getAllMember",method=RequestMethod.POST)
	public List<Member> getAllMemberData() {
		return iMemberFacade.getAllMemberData();
	}
}
