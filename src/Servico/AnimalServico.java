package Servico;

import java.util.ArrayList;

import Dominio.Animal;
import Repositorio.AnimalRepositorio;

public class AnimalServico extends AbsServico<Animal> implements IServico<Animal>
{
    public AnimalServico(){
        this.repositorio = new AnimalRepositorio();
    }

    @Override
    public ArrayList<Animal> browse() {
        return this.repositorio.readAll();

    }

    @Override
    public Animal read(int codigo) {
        return this.repositorio.readOne(codigo);

    }

    @Override
    public Animal edit(Animal instancia) {
        return this.repositorio.update(instancia);
    }

    @Override
    public Animal add(Animal instancia) {
        return this.repositorio.create(instancia);
    }

    @Override
    public Animal deleteById(int codigo) {
        return this.repositorio.deleteById(codigo);
    }

    @Override
    public Animal deleteByInstance(Animal instancia) {
        return this.repositorio.deleteByInstance(instancia);
    }
    
    
}
