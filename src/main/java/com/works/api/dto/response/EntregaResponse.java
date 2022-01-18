package com.works.api.dto.response;

import com.works.domain.model.StatusEntrega;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
public class EntregaResponse {

    private Long id;
    private ClienteResumoModel clienteResumoModel;
    private DestinatarioModel destinario;
    private BigDecimal taxa;
    private StatusEntrega status;
    private OffsetDateTime datePedido;
    private OffsetDateTime dataFinalizacao;
}
