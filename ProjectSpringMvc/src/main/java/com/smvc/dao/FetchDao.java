package com.smvc.dao;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.smvc.pojo.FetchPojo;
import com.smvc.pojo.RegistrationPojo;

public interface FetchDao 
{
	/*
	 * public void registrate(RegistrationPojo user);
	 */
	public List<FetchPojo> listCategory();
}
