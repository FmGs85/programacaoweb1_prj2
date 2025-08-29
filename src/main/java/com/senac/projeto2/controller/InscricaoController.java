package com.senac.projeto2.controller;

import com.senac.projeto2.dto.response.InscricaoDtoResponse;
import com.senac.projeto2.repository.JogoRepository;
import com.senac.projeto2.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/inscricoes")

public class InscricaoController {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @Autowired
    private ParticipanteRepository participanteRepository;

    @Autowired
    private JogoRepository jogoRepository;

    @PostMapping
    public InscricaoDtoResponse

}
