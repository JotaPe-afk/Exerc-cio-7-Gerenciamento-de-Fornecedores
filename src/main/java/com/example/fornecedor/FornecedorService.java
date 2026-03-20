package com.example.fornecedor;

import com.example.fornecedor.models.FornecedorModel;
import com.example.fornecedor.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository livroRepository;

    public FornecedorModel criarFornecedor(FornecedorModel livroModel){
        return livroRepository.save(livroModel);
    }

    public List<FornecedorModel> listarFornecedor(){
        return livroRepository.findAll();
    }

    public Optional<FornecedorModel> buscarFornecedor(Long id){
        return livroRepository.findById(id);
    }

    public void deletarFornecedor(Long id){
        livroRepository.deleteById(id);
    }
}
