package com.springWeb.WebTest;

/**
 * Hello world!
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloWorld 
{
	@RequestMapping(method=RequestMethod.GET)
	public String printWelcome(ModelMap model ){
		model.addAttribute("message", "test message");
		return "list";
	}
	
	
}
