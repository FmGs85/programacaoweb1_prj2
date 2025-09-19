package com.senac.projeto2.dto.request;

import java.time.LocalDateTime;

public class InscricaoDTORequestUpdate {
    private LocalDateTime data;
    private Integer status;
    private Integer IdParticipante;
    private Integer IdJogo;

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIdParticipante() {
        return IdParticipante;
    }

    public void setIdParticipante(Integer idParticipante) {
        IdParticipante = idParticipante;
    }

    public Integer getIdJogo() {
        return IdJogo;
    }

    public void setIdJogo(Integer idJogo) {
        IdJogo = idJogo;
    }
}
