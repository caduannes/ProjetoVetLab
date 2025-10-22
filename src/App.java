import java.util.ArrayList;

import Dominio.Cliente;
import Dominio.Colaborador;
import Dominio.Fornecedor;
import Repositorio.ClienteRepositorio;
import FakeDB.ColaboradorFakeDB;
import FakeDB.FornecedorFakeDB;

public class App{
    public static void main(String[] args) throws Exception {
        ClienteRepositorio repo = new ClienteRepositorio();
        ArrayList<Cliente> clientes = repo.readAll();
            System.out.println("Clientes: ");
        for (Cliente cliente : clientes) {
            System.out.println("Codigo: "+ cliente.getCodigo());
            System.out.println("CPF: "+ cliente.getCpf());
            System.out.println("Email: "+ cliente.getEmail());
        }
        ColaboradorFakeDB db2 = new ColaboradorFakeDB();
        ArrayList<Colaborador> colaboradores = db2.getInstancia();
            System.out.println("Colaboradores: ");
        for (Colaborador colaborador : colaboradores) {
            System.out.println("Codigo: "+ colaborador.getCodigo());
            System.out.println("Matricula: "+ colaborador.getMatricula());
            System.out.println("Nome: "+ colaborador.getNome());
        }
        FornecedorFakeDB db3 = new FornecedorFakeDB();
        ArrayList<Fornecedor> fornecedores = db3.getInstancia();
            System.out.println("Fornecedores: ");
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("Codigo: "+ fornecedor.getCodigo());
            System.out.println("Razão Social: "+ fornecedor.getRazaoSocial());
            System.out.println("Nome Fantasia: "+ fornecedor.getNomeFantasia());
            System.out.println("Telefone para contato: "+ fornecedor.getContatoTel());
        }
    }
}