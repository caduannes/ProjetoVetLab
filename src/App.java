import Dominio.Animal;
import Dominio.Cliente;
import Dominio.Colaborador;
import Dominio.Fornecedor;
import Dominio.Veterinario;
import Servico.AnimalServico;
import Servico.ClienteServico;
import Servico.ColaboradorServico;
import Servico.FornecedorServico;
import Servico.VeterinarioServico;
import java.util.ArrayList;

public class App{
    public static void main(String[] args) throws Exception {
        ClienteServico srvCli = new ClienteServico();
        ArrayList<Cliente> clientes = srvCli.browse();
            System.out.println("Clientes: ");
        for (Cliente cliente : clientes) {
            System.out.println("Codigo: "+ cliente.getCodigo());
            System.out.println("CPF: "+ cliente.getCpf());
            System.out.println("Email: "+ cliente.getEmail());
        }
        ColaboradorServico srvCol = new ColaboradorServico();
        ArrayList<Colaborador> colaboradores = srvCol.browse();
            System.out.println("Colaboradores: ");
        for (Colaborador colaborador : colaboradores) {
            System.out.println("Codigo: "+ colaborador.getCodigo());
            System.out.println("Matricula: "+ colaborador.getMatricula());
            System.out.println("Nome: "+ colaborador.getNome());
            System.out.println("CPF: "+ colaborador.getCpf());
        }
        FornecedorServico srvFor = new FornecedorServico();
        ArrayList<Fornecedor> fornecedores = srvFor.browse();
            System.out.println("Fornecedores: ");
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("Codigo: "+ fornecedor.getCodigo());
            System.out.println("Razão Social: "+ fornecedor.getRazaoSocial());
            System.out.println("Nome Fantasia: "+ fornecedor.getNomeFantasia());
            System.out.println("Telefone para contato: "+ fornecedor.getContatoTel());
        }
        AnimalServico srvAni = new AnimalServico();
        ArrayList<Animal> animais = srvAni.browse();
            System.out.println("Animais: ");
        for (Animal animal : animais) {
            System.out.println("Codigo: "+ animal.getCodigo());
            System.out.println("Nome: "+ animal.getNome());
            System.out.println("Especie: "+ animal.getEspecie());
            System.out.println("Raça: "+ animal.getRaca());
            
        }
        VeterinarioServico srvVet = new VeterinarioServico();
        ArrayList<Veterinario> veterinarios = srvVet.browse();
            System.out.println("Veterinários: ");
        for (Veterinario veterinario : veterinarios) {
            System.out.println("Codigo: "+ veterinario.getCodigo());
            System.out.println("Nome: "+ veterinario.getNome());
            System.out.println("RG: "+ veterinario.getRg());
            System.out.println("CRMV: "+ veterinario.getRegCRMV());
        }
    }
}