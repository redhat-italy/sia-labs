package eu.sia.sialabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/web")
public class AccessoController {

	
	@RequestMapping(value = "/login")
	public String controlloUtente(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) throws Exception {
		model.addAttribute("messaggio", "Benvenuto " + name);
		return "benvenuto";
	}
	
		
}
