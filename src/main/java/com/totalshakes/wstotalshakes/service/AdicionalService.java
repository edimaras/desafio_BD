package com.totalshakes.wstotalshakes.service;

import com.totalshakes.wstotalshakes.entities.Adicional;
import com.totalshakes.wstotalshakes.repositories.AdicionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdicionalService {

    @Autowired
    private AdicionalRepository adicionalRepository;

    public List<Adicional> buscarTodosAdicionais() {
        List<Adicional> adicional = new ArrayList<Adicional>();
        adicionalRepository.findAll().forEach(adicional1 -> adicional.add(adicional1));
        return adicional;
    }

    public Adicional buscarAdicional(Integer id) {
        return adicionalRepository.findById(id).get();
    }

    public void salvarAdicional(Adicional adicional) {
        adicionalRepository.save(adicional);
    }

    public void atualizarAdicional(Adicional adicional) {
        adicionalRepository.save(adicional);
    }

    public void deletarAdicional(Integer id) {
        adicionalRepository.deleteById(id);
    }

}
