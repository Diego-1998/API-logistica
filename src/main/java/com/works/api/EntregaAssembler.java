package com.works.api;

import com.works.api.dto.request.EntregaRequest;
import com.works.api.dto.response.EntregaResponse;
import com.works.domain.model.Entrega;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class EntregaAssembler {

    private ModelMapper modelMapper;

    public EntregaResponse toModel(Entrega entrega) {
        return modelMapper.map(entrega, EntregaResponse.class);
    }

    public List<EntregaResponse> toCollectionModel(List<Entrega> entregas) {
        return entregas
                .stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }

    public Entrega toEntity(EntregaRequest entregaRequest) {
        return modelMapper.map(entregaRequest, Entrega.class);
    }

}
