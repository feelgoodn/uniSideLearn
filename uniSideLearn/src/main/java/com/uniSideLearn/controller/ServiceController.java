package com.uniSideLearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.uniSideLearn.entity.Comments;
import com.uniSideLearn.entity.UserInfo;
import com.uniSideLearn.services.CommentService;
import com.uniSideLearn.services.UserService;

@Controller
public class ServiceController 
{
	
	@Autowired
	UserService uservice;
	
	@Autowired
	CommentService cService;
	
	@PostMapping("/addUser")
	public String addUser(@RequestParam("firstname")String firstname,
			@RequestParam("lastname")String lastname,
			@RequestParam("email")String email,
			@RequestParam("number")long number,
			@RequestParam("password")String password,
			@RequestParam("confirmpassword")String confirmpassword,
			@RequestParam("role")String role , RedirectAttributes res ){
		
		boolean emailExists = uservice.checkEmail(email);
		if(emailExists == false)
		{
	      UserInfo user = new UserInfo();
	      user.setFirstname(firstname);
	      user.setLastname(lastname);
	      user.setNumber(number);
	      user.setEmail(email);
	      user.setPassword(password);
	      user.setConfirmpassword(confirmpassword);
	      user.setRole(role);
	      uservice.addUser(user);
	      res.addFlashAttribute("success", "Registration Successful...!");
	      return "redirect:/register";
		}
		else
		{
			 res.addFlashAttribute("success", "Already Register...!");
			return "redirect:/register";
		}
	}
	  
	
	@PostMapping("/validate")
	public String Validate(@RequestParam("email")String email,
			@RequestParam("password")String password, RedirectAttributes res) {
		boolean val =uservice.validate(email, password);
		//if user is valid
		if(val == true)
		{
			if(uservice.getUseRole(email).equals("trainer")) {
				return "trainerHome";
			}
			else {
				return "studentHome";
			}

		}
					
		else
		{
			res.addFlashAttribute("sucess", "Incorrect Credentials.Try again...!");
			return "login";
		}
	}
		
		@PostMapping("/addComment")
		public String comments(@RequestParam("comment") String comment, Model model, RedirectAttributes res) {
        Comments c = new Comments();
        c.setComment(comment);
        cService.addComment(c);
        
        List<Comments> commentsList = cService.commentList();
        model.addAttribute("comments", commentsList);
        res.addFlashAttribute("sucess","Comment Added Successfully...!");
        return "redirect:/demoLesson";
		}
        
        
      }


