package com.practice.AngularAndSpringBoot.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.practice.AngularAndSpringBoot.dao.IMemberDao;
import com.practice.AngularAndSpringBoot.entity.Member;

@Repository
public class MemberDao implements IMemberDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Member> getAllMemberData() {
		return entityManager.createQuery("from Member").getResultList();
	}

}
