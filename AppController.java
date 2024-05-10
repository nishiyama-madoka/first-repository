package com.example.profileapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AppController {
	//新規登録画面
	@RequestMapping("/")
	public String signin() {
		return "signin";
	}
	
	//エラー文
	 @RequestMapping(value = "/", method = RequestMethod.POST)
	    public String create(@Validated @ModelAttribute UserAddRequest userRequest, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	             //入力チェックエラーの場合
	            List<String> errorList = new ArrayList<String>();
	            for (ObjectError error : result.getAllErrors()) {
	                errorList.add(error.getDefaultMessage());
	            }
	            model.addAttribute("validationError", errorList);
	            return "signin";
	        }
	        }
	
	//トップ画面
	@RequestMapping("/top")
	public String topLoggedIn() {
		return "topLoggedIn";
	}
	
}
