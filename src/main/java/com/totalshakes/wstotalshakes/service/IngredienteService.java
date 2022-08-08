package com.totalshakes.wstotalshakes.service;

import com.totalshakes.wstotalshakes.entities.Ingrediente;
import com.totalshakes.wstotalshakes.repositories.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    public List<Ingrediente> buscarTodosIngredientes() {
        List<Ingrediente> ingrediente = new ArrayList<Ingrediente>();
        ingredienteRepository.findAll().forEach(ingrediente1 -> ingrediente.add(ingrediente1));
        return ingrediente;
    }

    public Ingrediente buscarIngrediente(Integer id) {
        return ingredienteRepository.findById(id).get();
    }

    public void salvarIngrediente(Ingrediente ingrediente) {
        ingredienteRepository.save(ingrediente);
    }

    public void atualizarIngrediente(Ingrediente ingrediente, Integer id) {
        ingredienteRepository.save(ingrediente);
    }

    public void deletarIngrediente(Integer id) {
        ingredienteRepository.deleteById(id);
    }

}
