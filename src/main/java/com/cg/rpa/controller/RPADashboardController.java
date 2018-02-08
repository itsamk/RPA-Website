package com.cg.rpa.controller;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.rpa.model.Login;
import com.cg.rpa.model.RPADashboardDealMasterBean;
import com.cg.rpa.model.RpaPipelineMaster;
import com.cg.rpa.model.User;
import com.cg.rpa.dao.UserDao;
import com.cg.rpa.dao.UserServiceImpl;

//https://www.programcreek.com/2014/02/spring-mvc-helloworld-using-maven-in-eclipse/
//https://dzone.com/articles/spring-mvc-example-for-user-registration-and-login-1
@Controller
public class RPADashboardController {
	@Autowired
	UserServiceImpl userService;
	/*
	  @RequestMapping("/RPADashboardController") public ModelAndView showMessage(
	  
	  @RequestParam(value = "account", required = false, defaultValue = "World1")
	  String name) { System.out.println("in RPADashboardController");
	  
	  ModelAndView mv = new ModelAndView("ProjectEntrySuccess");
	  mv.addObject("message", message); mv.addObject("account", name); return mv; }
	 
*/
	@RequestMapping(value = "/rpadashboardcontroller", method = RequestMethod.POST)
	public ModelAndView registerRPADeal(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("RpaPipelineMaster") RpaPipelineMaster rpaPipelineMaster,BindingResult result, ModelMap model) {

		System.out.println("Inside registerRPADeal************");

		ModelAndView mav = null;
		 User user = userService.registerDeal(new RpaPipelineMaster());
		 
		 HttpSession session = request.getSession();
		  session.setAttribute("UserName", "helloooooooo");
		  session.setAttribute("registeredDeal", rpaPipelineMaster);
		 
		if (null != user) {
			System.out.println("helloooooo");
			mav = new ModelAndView("ProjectEntrySuccess");
			mav.addObject("businessUnit", rpaPipelineMaster.getBusinessUnit());
			System.out.println("Account=" + rpaPipelineMaster.getAccount());
			
		} else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Username or Password is wrong!!");
		}

		return mav;
	}
}
