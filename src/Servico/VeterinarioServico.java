package Servico;

import java.util.ArrayList;

import Dominio.Veterinario;
import Repositorio.VeterinarioRepositorio;

public class VeterinarioServico extends AbsServico<Veterinario> implements IServico<Veterinario>{

    public VeterinarioServico(){
        this.repositorio = new VeterinarioRepositorio();
    }

    @Override
    public ArrayList<Veterinario> browse() {
        return this.repositorio.readAll();
    }
    @Override
    public Veterinario read(int codigo) {
        return this.repositorio.readOne(codigo);
    }
    @Override
    public Veterinario edit(Veterinario instancia) {
        return this.repositorio.update(instancia);
    }
    @Override
    public Veterinario add(Veterinario instancia) {
        return this.repositorio.create(instancia);
    }
    @Override
    public Veterinario deleteById(int codigo) {
        return this.repositorio.deleteById(codigo);
    }
    @Override
    public Veterinario deleteByInstance(Veterinario instancia) {
        return this.repositorio.deleteByInstance(instancia);
    }
}
