package it.redhat.sia.labs.service;

import it.redhat.sia.labs.model.FormDTO;
import org.springframework.stereotype.Component;

@Component
public class FormService {

    public void execute(FormDTO dto) {
        System.out.println("===========> " + dto.toString());
    }
}
