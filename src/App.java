import java.util.ArrayList;

import Dominio.Animal;
import Dominio.Cliente;
import Dominio.Colaborador;
import Dominio.Fornecedor;
import Repositorio.AnimalRepositorio;
import Repositorio.ClienteRepositorio;
import Repositorio.ColaboradorRepositorio;
import Repositorio.FornecedorRepositorio;

public class App{
    public static void main(String[] args) throws Exception {
        ClienteRepositorio repoCli = new ClienteRepositorio();
        ArrayList<Cliente> clientes = repoCli.readAll();
            System.out.println("Clientes: ");
        for (Cliente cliente : clientes) {
            System.out.println("Codigo: "+ cliente.getCodigo());
            System.out.println("CPF: "+ cliente.getCpf());
            System.out.println("Email: "+ cliente.getEmail());
        }
        ColaboradorRepositorio repoCol = new ColaboradorRepositorio();
        ArrayList<Colaborador> colaboradores = repoCol.readAll();
            System.out.println("Colaboradores: ");
        for (Colaborador colaborador : colaboradores) {
            System.out.println("Codigo: "+ colaborador.getCodigo());
            System.out.println("Matricula: "+ colaborador.getMatricula());
            System.out.println("Nome: "+ colaborador.getNome());
        }
        FornecedorRepositorio repoFor = new FornecedorRepositorio();
        ArrayList<Fornecedor> fornecedores = repoFor.readAll();
            System.out.println("Fornecedores: ");
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("Codigo: "+ fornecedor.getCodigo());
            System.out.println("Razão Social: "+ fornecedor.getRazaoSocial());
            System.out.println("Nome Fantasia: "+ fornecedor.getNomeFantasia());
            System.out.println("Telefone para contato: "+ fornecedor.getContatoTel());
        }
        AnimalRepositorio repoAni = new AnimalRepositorio();
        ArrayList<Animal> animais = repoAni.readAll();
            System.out.println("Animais: ");
        for (Animal animal : animais) {
            System.out.println("Codigo: "+ animal.getCodigo());
            System.out.println("Nome: "+ animal.getNome());
            System.out.println("Especie: "+ animal.getEspecie());
            System.out.println("Raça: "+ animal.getRaca());
            
        }
    }
}