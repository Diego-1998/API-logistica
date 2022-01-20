package com.works.domain.service;

import com.works.domain.excepction.EntidadeNaoEncontradaException;
import com.works.domain.excepction.NegocioException;
import com.works.domain.model.Entrega;
import com.works.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

    private EntregaRepository entregaRepository;

    public Entrega buscar(Long entregaId) {
        return entregaRepository.findById(entregaId)
            .orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
    }
}
