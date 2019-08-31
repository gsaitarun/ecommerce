package com.smvc.controller;

import java.util.Collection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smvc.dao.UserDao;
import com.smvc.pojo.RegistrationPojo;

@Controller
@ComponentScan
public class RegistrationController
{
	@Autowired(required = true)
	UserDao userdao;
	
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	
	@RequestMapping(value = "/registration",method = RequestMethod.POST)
	 public ModelAndView connect3( @Valid @ModelAttribute("user") RegistrationPojo user ,BindingResult result)
	 {
		userdao.registrate(user);
		System.out.println("First Name"+user.getFirstname());
		
		if(result.hasErrors()) 
		{
			
			ModelAndView mav = new ModelAndView("Registration");
			return mav;
		}
		
		//model.addAttribute("firstname",user.getFirstname());

		return new ModelAndView("final","firstname",user.getFirstname());			
		//return "Welcome";
	 }
	@RequestMapping("/registration2")
	public String Show()
	{
		return "Registration";
	}
}