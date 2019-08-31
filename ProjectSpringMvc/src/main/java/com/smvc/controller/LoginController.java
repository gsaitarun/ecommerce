package com.smvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smvc.dao.UserDao;
import com.smvc.pojo.LoginPojo;
import com.smvc.pojo.RegistrationPojo;

@Controller
@ComponentScan
public class LoginController
{
	@Autowired
	UserDao userdao;
	
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	@RequestMapping(value ="login",method = RequestMethod.GET)
 public ModelAndView connect2(@ModelAttribute("login") LoginPojo login)
 {
	ModelAndView mav ;
		RegistrationPojo rs = userdao.validation(login);
	    if(rs != null)
	    {
	    	mav = new ModelAndView("final");
	    	mav.addObject("firstname",rs.getFirstname());
	    
	    } 
	    else
	    {
	    	mav = new ModelAndView("final");
	    	mav.addObject("message","Username or password is invalid");
	    }
	 return mav;
	 
 }

	@RequestMapping(value ="login2",method = RequestMethod.GET)
	 public ModelAndView connect1(@ModelAttribute("login2") LoginPojo login)
	 {
		System.out.println("login1st");
		ModelAndView mav ;
		LoginPojo rs = userdao.Connect1();
		    if(rs != null)
		    {
		    	mav = new ModelAndView("Login");
		    	
		    
		    } 
		    else
		    {
		    	mav = new ModelAndView("Login");
		    	mav.addObject("message","Username or password is invalid");
		    }
		 return mav;
		 
	 }

	@RequestMapping("/pc1")
	public String Connect2() 
	{
		System.out.println("hii came");
		return "pc1";
	}
	

	@RequestMapping("/pc2")
	public String Connect3() 
	{
		System.out.println("hii came");
		return "pc2";
	}
	

	@RequestMapping("/ps3")
	public String Connect4() 
	{
		System.out.println("hii came");
		return "ps3";
	}
	@RequestMapping("/ps4")
	public String Connect5() 
	{
		System.out.println("hii came");
		return "ps4";
	}
	@RequestMapping("/ps5")
	public String Connect6() 
	{
		System.out.println("hii came");
		return "ps5";
	}
	@RequestMapping("/inner")
	public String Connect7() 
	{
		System.out.println("hii came");
		return "final";
	}
	
}





