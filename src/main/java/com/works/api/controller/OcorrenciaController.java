package com.works.api.controller;

import com.works.api.assembler.OcorrenciaAssembler;
import com.works.api.dto.request.OcorrenciaRequest;
import com.works.api.dto.response.OcorrenciaResponse;
import com.works.domain.model.Entrega;
import com.works.domain.model.Ocorrencia;
import com.works.domain.service.BuscaEntregaService;
import com.works.domain.service.RegistroOcorrenciaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/entregas/{entregaId}/ocorrencias")
public class OcorrenciaController {

    private RegistroOcorrenciaService registroOcorrenciaService;
    private OcorrenciaAssembler ocorrenciaAssembler;
    private BuscaEntregaService buscaEntregaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OcorrenciaResponse registrar(@PathVariable Long entregaId,
                                @Valid @RequestBody OcorrenciaRequest ocorrenciaRequest){
      Ocorrencia ocorrenciaRegistrada = registroOcorrenciaService
              .registrar(entregaId, ocorrenciaRequest.getDescricao());

        return ocorrenciaAssembler.toModel(ocorrenciaRegistrada);
    };

    @GetMapping
    public List<OcorrenciaResponse> listar(@PathVariable Long entregaId) {
        Entrega entrega = buscaEntregaService.buscar(entregaId);

        return ocorrenciaAssembler.toCollectionModel(entrega.getOcorrencias());
    }



}
