package pu.course.web.springmvcdemo.web;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	

	@RequestMapping("/")
	public ModelAndView sayHello(@CookieValue Optional<Integer> age, Errors errors) {
		
		ModelAndView mav = new ModelAndView("index.html");
		mav.addObject("name", name.orElse("Guest"));
		return mav;
	}
}
