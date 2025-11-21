import Dominio.Animal;
import Dominio.Cliente;
import Dominio.Colaborador;
import Dominio.Fornecedor;
import Dominio.ItemPedido;
import Dominio.Pedido;
import Dominio.Veterinario;
import Servico.AnimalServico;
import Servico.ClienteServico;
import Servico.ColaboradorServico;
import Servico.FornecedorServico;
import Servico.PedidoServico;
import Servico.VeterinarioServico;
import java.util.ArrayList;

public class App{
    public static void main(String[] args) throws Exception {
        int totalQts = 0;
        float totalValor = 0;
        float totalCusto = 0;

        ClienteServico srvCli = new ClienteServico();
        ArrayList<Cliente> clientes = srvCli.browse();
            System.out.println("\n------CLIENTES------");
        for (Cliente cliente : clientes) {
            System.out.println("Codigo: "+ cliente.getCodigo());
            System.out.println("CPF: "+ cliente.getCpf());
            System.out.println("Email: "+ cliente.getEmail());
            System.out.println("Numero do Cartão: "+ cliente.getNumeroCartao());
        }
        ColaboradorServico srvCol = new ColaboradorServico();
        ArrayList<Colaborador> colaboradores = srvCol.browse();
            System.out.println("\n------COLABORADORES------");
        for (Colaborador colaborador : colaboradores) {
            System.out.println("Codigo: "+ colaborador.getCodigo());
            System.out.println("Matricula: "+ colaborador.getMatricula());
            System.out.println("Nome: "+ colaborador.getNome());
            System.out.println("CPF: "+ colaborador.getCpf());
            System.out.println("Email: "+ colaborador.getEmail());
            System.out.println("Salário: "+ colaborador.getSalario());
        }
        FornecedorServico srvFor = new FornecedorServico();
        ArrayList<Fornecedor> fornecedores = srvFor.browse();
            System.out.println("\n------FORNECEDORES------");
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("Codigo: "+ fornecedor.getCodigo());
            System.out.println("CNPJ: "+ fornecedor.getCnpj());
            System.out.println("Razão Social: "+ fornecedor.getRazaoSocial());
            System.out.println("Nome Fantasia: "+ fornecedor.getNomeFantasia());
            System.out.println("Telefone para contato: "+ fornecedor.getContatoTel());
            System.out.println("Email para contato: "+ fornecedor.getContatoEmail());
        }
        AnimalServico srvAni = new AnimalServico();
        ArrayList<Animal> animais = srvAni.browse();
            System.out.println("\n------ANIMAIS------");
        for (Animal animal : animais) {
            System.out.println("Codigo: "+ animal.getCodigo());
            System.out.println("Nome: "+ animal.getNome());
            System.out.println("Especie: "+ animal.getEspecie());
            System.out.println("Raça: "+ animal.getRaca());
            System.out.println("Data de Nascimento: "+ animal.getDtNascimento());
        }
        VeterinarioServico srvVet = new VeterinarioServico();
        ArrayList<Veterinario> veterinarios = srvVet.browse();
            System.out.println("\n------VETERINÁRIOS------");
        for (Veterinario veterinario : veterinarios) {
            System.out.println("Codigo: "+ veterinario.getCodigo());
            System.out.println("Nome: "+ veterinario.getNome());
            System.out.println("Email: "+ veterinario.getEmail());
            System.out.println("RG: "+ veterinario.getRg());
            System.out.println("CPF: "+ veterinario.getCpf());
            System.out.println("CRMV: "+ veterinario.getRegCRMV());
        }
        PedidoServico srvPed = new PedidoServico();
        ArrayList<Pedido> pedidos = srvPed.browse();
            System.out.println("\n------PEDIDO------");
        for (Pedido pedido : pedidos) {
            System.out.println("Codigo: "+ pedido.getCodigo());
            System.out.println("Número do Pedido: "+ pedido.getNumero());
            System.out.println("Data do Pedido: "+ pedido.getData());
            System.out.println("\t------ITENS------");
            for (ItemPedido item : pedido.getItensPedido()) {
                System.out.println("\tCodigo do item: "+ item.getCodigo());
                System.out.println("\tPreço Unitário: "+ item.getProduto().getPrecoVenda());
                System.out.println("\tQuantidade: "+ item.getQuantidade());
                totalQts += item.getQuantidade();
                totalValor += item.getProduto().getPrecoVenda();
                totalCusto += item.getProduto().getPrecoCusto();
            }
            System.out.println();
        }

        System.out.println("------CAIXA------");
        System.out.println("Total de Vendas: " + totalQts);
        System.out.println("Total Valor Bruto: " + totalValor);
        System.out.println("Total Lucro: " + (totalValor - totalCusto));
    }
}