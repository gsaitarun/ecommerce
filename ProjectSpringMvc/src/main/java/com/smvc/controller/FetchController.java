package com.smvc.controller;

import java.io.BufferedOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smvc.dao.FetchDao;
import com.smvc.dao.FetchDao2;
import com.smvc.dao.FetchDao3;
import com.smvc.pojo.FetchPojo;
import com.smvc.pojo.FetchPojo2;
import com.smvc.pojo.FetchPojo3;
import com.smvc.pojo.PicturePojo;

@Controller
@ComponentScan
public class FetchController {
	/*
	 * @RequestMapping("/display") void
	 * displaay(){System.out.println("display method showing");}
	 */
	@Autowired
	FetchDao fetchdao;
	
	public void setFetchdao(FetchDao fetchdao) {
		this.fetchdao = fetchdao;
	}
	@Autowired
	FetchDao2 fetchdao2;
	
	public void setFetchdao2(FetchDao2 fetchdao2) {
		this.fetchdao2 = fetchdao2;
	}
	
	@Autowired
	FetchDao3 fetchdao3;
	
	public void setFetchdao3(FetchDao3 fetchdao3) {
		this.fetchdao3 = fetchdao3;
	}
	
	/* @Valid @ModelAttribute("p") FetchPojo p*/
	@RequestMapping(value = "fetch1",method = RequestMethod.GET)
	public ModelAndView  connect1(/* Model model , */  @ModelAttribute("p")  FetchPojo p ) {
		System.out.println("Calling Controller");
		//fetchdao.listCategory(p);
		//System.out.println("computers" + p.getDesktops());
		/* model.addAttribute(p); */
		 return new ModelAndView("desktopshow","list",fetchdao.listCategory());
		
	//.return "pc1";
	}
	
	
	
	@RequestMapping(value = "fetch3",method = RequestMethod.GET)
	public ModelAndView Listing(@ModelAttribute("l")  FetchPojo3 p3) {
		
		System.out.println(fetchdao3.listCategory3()+"iiiii");
		
		return new ModelAndView("listing", "list", fetchdao3.listCategory3());
//		new ModelAndView("pc2", "list", fetchdao.listCategory());
	}
	
	
	
	
	
	
	
	

	@RequestMapping(value = "fetch2/{id}",method = RequestMethod.GET)
	public ModelAndView connect2(@PathVariable String id , @ModelAttribute("p2")  FetchPojo2 p2) {
		
		//this section for trial
		//ModelAndView mav = new ModelAndView();
		//mav.addObject("ID", fetchdao2.getProductDetailsById(Integer.parseInt(id)));
         System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		return new ModelAndView("intelshow", "ID", fetchdao2.getProductDetailsById(Integer.parseInt(id)));
		//till dis
		//   System.out.println(fetchdao2.listCategory2()+"iiiii");
		//   return new ModelAndView("intelshow", "list", fetchdao2.listCategory2());
//		new ModelAndView("pc2", "list", fetchdao.listCategory());
	}
	

	
	/*
	 * @RequestMapping(value = "fetch3",method = RequestMethod.GET) public
	 * ModelAndView connect3(@ModelAttribute("p3") FetchPojo2 p2) {
	 * 
	 * System.out.println(fetchdao2.listCategory2(null, null)+"iiiii");
	 * 
	 * return new ModelAndView("ps3", "list", fetchdao2.listCategory2()); // new
	 * ModelAndView("pc2", "list", fetchdao.listCategory()); }
	 */
	///this is method 
	/*
	 * @RequestMapping("picture1") public String display(Model
	 * model,HttpServletResponse response,HttpServletRequest request) {
	 * model.addAttribute("obj",fetchdao2.display(response, request)); return "ps5";
	 * }
	 */
}
