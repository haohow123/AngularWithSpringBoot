package com.practice.AngularAndSpringBoot.facade;

import java.util.List;

import com.practice.AngularAndSpringBoot.entity.Member;

public interface IMemberFacade {
	
	/**
	   * @note Created On 2017年12月28日
	   * @author Henry Hsu
	   * @description 取得全部會員的資料
	   * @param 
	   * @return 
	   */
	public List<Member> getAllMemberData();
}
