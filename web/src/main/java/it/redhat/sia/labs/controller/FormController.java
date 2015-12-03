package it.redhat.sia.labs.controller;

import it.redhat.sia.labs.model.FormDTO;
import it.redhat.sia.labs.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

    @Autowired
    private FormService formService;

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome(@RequestParam("nome") String nome, @RequestParam("cognome") String cognome) {
        ModelAndView model = new ModelAndView();
        model.setViewName("response");
        model.addObject("message", "Ciao " + nome + " " + cognome);
        formService.execute(new FormDTO(nome, cognome));
        return model;
    }
}
