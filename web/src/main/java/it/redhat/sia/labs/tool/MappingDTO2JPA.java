package it.redhat.sia.labs.tool;

import it.redhat.sia.labs.model.dto.UtenteDTO;
import it.redhat.sia.labs.model.entity.UtenteEntity;

public class MappingDTO2JPA {

    public static UtenteEntity getUtenteEntity(UtenteDTO dto) {
        UtenteEntity entity = new UtenteEntity();
        entity.setId(dto.getId() == null ? 0 : dto.getId());
        entity.setNome(dto.getNome());
        entity.setCognome(dto.getCognome());
        entity.setSesso(dto.getSesso());
        return entity;
    }


}
