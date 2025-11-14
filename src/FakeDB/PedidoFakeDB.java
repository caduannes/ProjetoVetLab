package FakeDB;

import Dominio.ItemPedido;
import Dominio.Pedido;
import Dominio.Produto;
import java.time.LocalDate;
import java.util.ArrayList;

public class PedidoFakeDB extends AbsFakeDB<Pedido> {

    @Override
    protected void AutoPreencher() {
        if (this.instancia == null){
            this.instancia = new ArrayList<>();
        }
        this.instancia.add(this.criarPedido(1, 111, LocalDate.now()));
        this.instancia.add(this.criarPedido(2, 121, LocalDate.now()));
        this.instancia.add(this.criarPedido(3, 131, LocalDate.now()));
        this.instancia.add(this.criarPedido(4, 141, LocalDate.now()));
        this.instancia.add(this.criarPedido(5, 151, LocalDate.now()));
    }
    
    public PedidoFakeDB(){
        super();
    }
    
    private Pedido criarPedido(int codigo, int numero, LocalDate data){
        Pedido pedido = new Pedido(codigo, numero, data);
        ArrayList<ItemPedido> itens = new ArrayList<>();
        itens.add(this.criarItemPedido(1, 10011, 3));
        itens.add(this.criarItemPedido(2, 10012, 3));
        itens.add(this.criarItemPedido(3, 10013, 3));
        itens.add(this.criarItemPedido(4, 10014, 3));
        itens.add(this.criarItemPedido(5, 10015, 3));
        pedido.setItensPedido(itens);
        return pedido;
    }

    private ItemPedido criarItemPedido(int codigo, int codigoPedido, int qtd){
        ItemPedido itemPedido = new ItemPedido(codigo, codigoPedido, qtd);
        itemPedido.setProduto(this.criarProduto(1, "Produto", 1.50f, 1.75f));
        itemPedido.setProduto(this.criarProduto(2, "Produto", 3.50f, 6.75f));
        itemPedido.setProduto(this.criarProduto(3, "Produto", 2.75f, 3.25f));
        return itemPedido;
    }

    private Produto criarProduto(int codigo, String descricao, float precoCusto, float precoVenda){
        return new Produto(codigo, descricao, precoCusto, precoVenda);
    }
}