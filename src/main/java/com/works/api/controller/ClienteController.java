package com.works.api.controller;

import com.works.api.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
      var cliente1 = new Cliente();
      cliente1.setId(1L);
      cliente1.setNome("Diego");
      cliente1.setTelefone("34  23444-1111");
      cliente1.setEmail("diegoleandro@ifood.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Alice");
        cliente2.setTelefone("21 5342-2444");
        cliente2.setEmail("alicemoda@youtube.com");

        return Arrays.asList(cliente1,cliente2);
    }
}
