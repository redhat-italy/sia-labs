package it.redhat.sia.labs.controller;

import it.redhat.sia.labs.manager.UtenteDAO;
import it.redhat.sia.labs.model.dto.UtenteDTO;
import it.redhat.sia.labs.tool.MappingDTO2JPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.ejb.EJB;

@Controller
@RequestMapping("/utente")
public class UtenteController {

    @Autowired
    private UtenteDAO utenteDAO;

    @RequestMapping(value = "/inserisci", method = RequestMethod.POST)
    public ModelAndView welcome(@RequestParam("nome") String nome, @RequestParam("cognome") String cognome, @RequestParam("sesso") String sesso) {
        ModelAndView model = new ModelAndView();
        model.setViewName("response");

        UtenteDTO dto = new UtenteDTO(nome,cognome,sesso);
        utenteDAO.inserisciUtente(MappingDTO2JPA.getUtenteEntity(dto));

        model.addObject("message", dto.toString());
        System.out.println(dto.toString());

        return model;
    }

}
