package com.totalshakes.wstotalshakes.controllers;

import com.totalshakes.wstotalshakes.entities.Adicional;
import com.totalshakes.wstotalshakes.service.AdicionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adicional")
public class AdicionalController {

    @Autowired
    private AdicionalService adicionalService;

    @GetMapping("/todos")
    private List<Adicional> buscarTodosAdicionais() {
        return adicionalService.buscarTodosAdicionais();
    }

    @GetMapping("buscar/{id}")
    private Adicional buscarAdicional(@PathVariable("id") Integer id) {
        return adicionalService.buscarAdicional(id);
    }

    @PostMapping("/salvar")
    private int salvarAdicional(@RequestBody Adicional adicional) {
        adicionalService.salvarAdicional(adicional);
        return adicional.getId();
    }

    @PutMapping("/atualizar")
    private Adicional atualizarAdicional(@RequestBody Adicional adicional) {
        adicionalService.atualizarAdicional(adicional);
        return adicional;
    }

    @DeleteMapping("/deletar/{id}")
    private void deletarAdicional(@PathVariable("id") Integer id) {
        adicionalService.deletarAdicional(id);
    }
}
