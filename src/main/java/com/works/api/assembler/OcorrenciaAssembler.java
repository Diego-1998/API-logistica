package com.works.api.assembler;

import com.works.api.dto.response.OcorrenciaResponse;
import com.works.domain.model.Ocorrencia;
import jdk.dynalink.linker.LinkerServices;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class OcorrenciaAssembler {

    private ModelMapper modelMapper;

    public OcorrenciaResponse toModel(Ocorrencia ocorrencia){
        return modelMapper.map(ocorrencia, OcorrenciaResponse.class);
    }

    public List<OcorrenciaResponse> toCollectionModel(List<Ocorrencia> ocorrencias) {
        return ocorrencias
                .stream().map(this::toModel)
                .collect(Collectors.toList());
    }
}
