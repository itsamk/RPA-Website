package com.cg.rpa.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.rpa.dao.UserDao;
import com.cg.rpa.model.Login;
import com.cg.rpa.model.RpaPipelineMaster;
import com.cg.rpa.model.User;

@Controller
public class LoginController {
	@Autowired
	// UserService userService;
	UserDao userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response){
		System.out.println("The login mapping executed");
		HttpSession session = request.getSession(false);
		User user_cred = (User) session.getAttribute("user_cred");
		ModelAndView mav;
		if(user_cred==null) {
			System.out.println(session);
		mav = new ModelAndView("login");
		mav.addObject("login", new Login());
		}
		else
			mav = new ModelAndView("UserHome");
		return mav;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login) {
		System.out.println("Inside loginProcess()" + " " + login.getUsername());
		ModelAndView mav = null;
		User user = userService.validateUser(login);
		HttpSession session = request.getSession(true);
		session.setAttribute("user_cred", user);
		if (null != user && null!= login.getAccess()) {
			if (login.getAccess().equals("user"))
				mav = new ModelAndView("UserHome");
			else if (login.getAccess().equals("admin"))
				mav = new ModelAndView("AdminHome");

			// mav.addObject("firstname", user.getFirstname());
		} else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Username or Password is wrong or there is an empty required field!!");
		}
		return mav;
	}

	@RequestMapping(value = "/userhome", method = RequestMethod.GET)
	public ModelAndView userhome(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView mav = null;

		mav = new ModelAndView("RPADashboardIndex");
		mav.addObject("RpaPipelineMaster", new RpaPipelineMaster());
		// mav.addObject("firstname", user.getFirstname());

		return mav;
	}
	@RequestMapping(value = "/signOut", method = RequestMethod.GET)
	public ModelAndView signOut(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView mav = null;
		
		HttpSession session = request.getSession();
		session.invalidate();
		mav = new ModelAndView("login");
		mav.addObject("login", new Login());
		mav.addObject("message", "You have successfully signed out.");
		return mav;
	}
}