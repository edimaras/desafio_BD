package com.totalshakes.wstotalshakes.controllers;

import com.totalshakes.wstotalshakes.entities.Ingrediente;
import com.totalshakes.wstotalshakes.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingrediente")
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;

    @GetMapping("/todos")
    private List<Ingrediente> getAllIngrediente() {
        return ingredienteService.buscarTodosIngredientes();
    }

    @GetMapping("buscar/{id}")
    private Ingrediente getIngrediente(@PathVariable("id") Integer id) {
        return ingredienteService.buscarIngrediente(id);
    }

    @PostMapping("/salvar")
    private int salvarIngrediente(@RequestBody Ingrediente ingrediente) {
        ingredienteService.salvarIngrediente(ingrediente);
        return ingrediente.getId();
    }

    @PutMapping("atualizar")
    private Ingrediente atualizarIngrediente(@RequestBody Ingrediente ingrediente) {
        ingredienteService.salvarIngrediente(ingrediente);
        return ingrediente;
    }

    @DeleteMapping("deletar/{id}")
    private void deletarIngrediente(@PathVariable("id") Integer id) {
        ingredienteService.deletarIngrediente(id);
    }

}
