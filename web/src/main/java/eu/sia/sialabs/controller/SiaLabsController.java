package eu.sia.sialabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SiaLabsController {

	@RequestMapping("/welcome")
	public ModelAndView welcomePage(@RequestParam(value="firstName", required=false) String firstName, @RequestParam(value="lastName", required=false) String lastName) {
		String message = "<br><div style='text-align:center;'>" 
				+ "<h3>********** Hello " + firstName + " " + lastName + ", Spring MVC Tutorial</h3>"
				+ "This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
