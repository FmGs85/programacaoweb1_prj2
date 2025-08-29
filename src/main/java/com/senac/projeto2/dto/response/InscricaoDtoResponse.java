package com.senac.projeto2.dto.response;

import java.time.LocalDateTime;

public class InscricaoDtoResponse {
    private int id;
    private LocalDateTime data;
    private int status;
    private int idParticipante;
    private String nomeParticipante;
    private int idJogo;

    public int getId() {
        return id;
    }

    public InscricaoDtoResponse(Inscricao inscricao){
        this.id = inscricao.getId();
        this.data =  inscricao.getData();
        this.status = inscricao.getStatus();
        this.idParticipante =  inscricao.getParticipante().getId();
        this.nomeParticipante = inscricao.getParticipante().getNome();
        this.idJogo = inscricao.getJogo().getId();

    }

    public LocalDateTime getData() {
        return data;
    }

    public int getStatus() {
        return status;
    }

    public int getIdParticipante() {
        return idParticipante;
    }

    public String getNomeParticipante() {
        return nomeParticipante;
    }

    public int getIdJogo() {
        return idJogo;
    }
}
