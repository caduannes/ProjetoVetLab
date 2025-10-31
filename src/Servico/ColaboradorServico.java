package Servico;

import java.util.ArrayList;

import Dominio.Colaborador;
import Repositorio.ColaboradorRepositorio;

public class ColaboradorServico extends AbsServico<Colaborador> implements IServico<Colaborador>
{
    public ColaboradorServico(){
        this.repositorio = new ColaboradorRepositorio();
    }

    @Override
    public ArrayList<Colaborador> browse() {
        return this.repositorio.readAll();
    }

    @Override
    public Colaborador read(int codigo) {
        return this.repositorio.readOne(codigo);

    }

    @Override
    public Colaborador edit(Colaborador instancia) {
        return this.repositorio.update(instancia);
    }

    @Override
    public Colaborador add(Colaborador instancia) {
        return this.repositorio.create(instancia);
    }

    @Override
    public Colaborador deleteById(int codigo) {
        return this.repositorio.deleteById(codigo);
    }

    @Override
    public Colaborador deleteByInstance(Colaborador instancia) {
        return this.repositorio.deleteByInstance(instancia);
    }
    
    
}
