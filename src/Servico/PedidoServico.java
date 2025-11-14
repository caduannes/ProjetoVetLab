package Servico;

import Dominio.Pedido;
import Repositorio.PedidoRepositorio;
import java.util.ArrayList;

public class PedidoServico extends AbsServico<Pedido> implements IServico<Pedido> {

    public PedidoServico(){
        this.repositorio = new PedidoRepositorio();
    }

    @Override
    public ArrayList<Pedido> browse() {
        return this.repositorio.readAll();
    }
    @Override
    public Pedido read(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Pedido edit(Pedido instancia) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Pedido add(Pedido instancia) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Pedido deleteById(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pedido deleteByInstance(Pedido instancia) {
        // TODO Auto-generated method stub
        return null;
    }

}