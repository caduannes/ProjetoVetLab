package Repositorio;

import Dominio.Pedido;
import FakeDB.PedidoFakeDB;

public class PedidoRepositorio extends AbsRepositorio<Pedido> {

    public PedidoRepositorio(){
        this.baseDeDados = new PedidoFakeDB();
        this.dados = this.baseDeDados.getInstancia();
    }

    @Override
    public Pedido create(Pedido instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Pedido readOne(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readOne'");
    }

    @Override
    public Pedido update(Pedido instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Pedido deleteById(int codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Pedido deleteByInstance(Pedido instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByInstance'");
    }
    
}