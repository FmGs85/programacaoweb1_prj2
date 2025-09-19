package com.senac.projeto2.service;

import com.senac.projeto2.dto.response.InscricaoDTOResponse;
import com.senac.projeto2.dto.request.InscricaoDTORequestUpdate;
import com.senac.projeto2.dto.request.InscricaoDTORequest;
import com.senac.projeto2.entity.Inscricao;
import com.senac.projeto2.repository.InscricaoRepository;
import com.senac.projeto2.repository.JogoRepository;
import com.senac.projeto2.repository.ParticipanteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {
    ModelMapper modelMapper;
    private final InscricaoRepository inscricaoRepository;
    private final JogoRepository jogoRepository;
    private final ParticipanteRepository participanteRepository;

    public InscricaoService(InscricaoRepository inscricaoRepository, JogoRepository jogoRepository, ParticipanteRepository participanteRepository, ModelMapper modelMapper) {
        this.inscricaoRepository = inscricaoRepository;
        this.jogoRepository = jogoRepository;
        this.participanteRepository = participanteRepository;
        this.modelMapper = modelMapper;
    }

    public List<Inscricao> listarInscricoes(){
        return inscricaoRepository.listarInscricoes();

    }
    public Inscricao ListaInscricaoPorId(Integer id){
        return inscricaoRepository.obterInscricaoPorId(id);
    }
    public InscricaoDTOResponse salvar (InscricaoDTORequest inscricaoDTORequest){
        Inscricao inscricao = new Inscricao();
        inscricao.setData(inscricaoDTORequest.getData());
        inscricao.setStatus(1);

    }
    public InscricaoDTOResponse atualizar(Integer id, InscricaoDTORequestUpdate inscricaoDTORequestUpdate){

    }
    public void apagar(Integer id){
        inscricaoRepository.apagadoLogico(id);
    }
}
