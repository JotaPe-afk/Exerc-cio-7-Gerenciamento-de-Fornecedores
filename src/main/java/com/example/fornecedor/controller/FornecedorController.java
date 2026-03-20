package com.example.fornecedor.controller;

import com.example.fornecedor.models.FornecedorModel;
import com.example.fornecedor.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public FornecedorModel criarFornecedor(@RequestBody FornecedorModel fornecedorModel){
        return fornecedorService.criarFornecedor(fornecedorModel);
    }

    @GetMapping
    public List<FornecedorModel> listarFornecedor(){
        return fornecedorService.listarFornecedor();
    }

    @GetMapping("/{id}")
    public Optional<FornecedorModel> buscarFornecedor(@PathVariable Long id){
        return fornecedorService.buscarFornecedor(id);
    }

    @DeleteMapping("/{id}")
    public void deletarFornecedor(@PathVariable  Long id){
        fornecedorService.deletarFornecedor(id);
    }
}
