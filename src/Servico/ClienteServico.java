package Servico;

import java.util.ArrayList;

import Dominio.Cliente;
import Repositorio.ClienteRepositorio;

public class ClienteServico extends AbsServico<Cliente> implements IServico<Cliente>
{
    public ClienteServico(){
        this.repositorio = new ClienteRepositorio();
    }

    @Override
    public ArrayList<Cliente> browse() {
        return this.repositorio.readAll();
    }

    @Override
    public Cliente read(int codigo) {
        return this.repositorio.readOne(codigo);
    }

    @Override
    public Cliente edit(Cliente instancia) {
        return this.repositorio.update(instancia);
    }

    @Override
    public Cliente add(Cliente instancia) {
        return this.repositorio.create(instancia);
    }

    @Override
    public Cliente deleteById(int codigo) {
        return this.repositorio.deleteById(codigo);
    }

    @Override
    public Cliente deleteByInstance(Cliente instancia) {
        return this.repositorio.deleteByInstance(instancia);
    }

}