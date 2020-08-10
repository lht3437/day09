package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.CompanyMapper;
import com.xiaoshu.dao.PersonMapper;
import com.xiaoshu.entity.Company;
import com.xiaoshu.entity.Person;
import com.xiaoshu.entity.PersonVo;

@Service
public class PersonService {

	@Autowired
	PersonMapper personMapper;

	// 新增
	public void addUser(Person t) throws Exception {
		personMapper.insert(t);
	};

	// 修改
	public void updateUser(Person t) throws Exception {
		personMapper.updateByPrimaryKeySelective(t);
	};

	// 删除
	public void deleteUser(Integer id) throws Exception {
		personMapper.deleteByPrimaryKey(id);
	};

	public PageInfo<PersonVo> findUserPage(PersonVo person, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		List<PersonVo> userList = personMapper.findAll(person);
		PageInfo<PersonVo> pageInfo = new PageInfo<PersonVo>(userList);
		return pageInfo;
	}
	@Autowired
	CompanyMapper companyMapper;
	public List<Company> dfghjkl() {
		
		return companyMapper.selectAll();
	}


}
