package com.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookStore.service.MyBookListService;

@Controller
public class MyBookListController {

	private MyBookListService service;
	
	@RequestMapping("/deleteMyList/{id}")
		public String deleteMyList(@PathVariable("id")int id) {
		service.deleteById(id);
			return "redirect:/my_books";
		}
	
}
