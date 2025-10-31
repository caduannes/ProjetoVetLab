package Servico;

import java.util.ArrayList;

import Dominio.Fornecedor;
import Repositorio.FornecedorRepositorio;

public class FornecedorServico extends AbsServico<Fornecedor> implements IServico<Fornecedor> {
    
    public FornecedorServico(){
        this.repositorio = new FornecedorRepositorio();
    }

    @Override
    public ArrayList<Fornecedor> browse() {
        return this.repositorio.readAll();
    }
    @Override
    public Fornecedor read(int codigo) {
        return this.repositorio.readOne(codigo);
    }
    @Override
    public Fornecedor edit(Fornecedor instancia) {
        return this.repositorio.update(instancia);
    }
    @Override
    public Fornecedor add(Fornecedor instancia) {
        return this.repositorio.create(instancia);
    }
    @Override
    public Fornecedor deleteById(int codigo) {
        return this.repositorio.deleteById(codigo);
    }
    @Override
    public Fornecedor deleteByInstance(Fornecedor instancia) {
        return this.repositorio.deleteByInstance(instancia);
    }
}