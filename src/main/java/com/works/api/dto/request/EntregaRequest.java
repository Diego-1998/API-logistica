package com.works.api.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
public class EntregaRequest {

    @NotNull
    @Valid
    private ClienteIdInput clienteInput;

    @Valid
    @NotNull
    private DestinatarioInput destinatarioInput;

    @NotNull
    private BigDecimal taxa;

}
