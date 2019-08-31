package com.smvc.dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smvc.pojo.FetchPojo;
import com.smvc.pojo.FetchPojo2;

public interface FetchDao2
{
	
	
	public List<FetchPojo2> listCategory2() ;

	public List<FetchPojo2> getProductDetailsById(int parseInt);
}
