package com.works.domain.service;

import com.works.domain.excepction.NegocioException;
import com.works.domain.model.Entrega;
import com.works.domain.model.Ocorrencia;
import com.works.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {

    private BuscaEntregaService buscaEntregaService;

    @Transactional
    public Ocorrencia registrar(Long entregaId, String descricao){
        Entrega entrega = buscaEntregaService.buscar(entregaId);

       return  entrega.adicionarOcorrencia(descricao);
    }
}
