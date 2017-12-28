package com.practice.AngularAndSpringBoot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.AngularAndSpringBoot.dao.IMemberDao;
import com.practice.AngularAndSpringBoot.entity.Member;
import com.practice.AngularAndSpringBoot.service.IMemberService;

@Service
public class MemberService implements IMemberService {
	@Autowired
	private IMemberDao iMemberDao;

	@Override
	public List<Member> getAllMemberData() {
		return iMemberDao.getAllMemberData();
	}

}
