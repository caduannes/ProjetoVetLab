import java.util.ArrayList;

import Dominio.Cliente;
import FakeDB.ClienteFakeDB;

public class App{
    public static void main(String[] args) throws Exception {
        ClienteFakeDB db = new ClienteFakeDB();
        ArrayList<Cliente> clientes = db.getInstancia();
        for (Cliente cliente : clientes) {
            System.out.println("Codigo: "+ cliente.getCodigo());
            System.out.println("CPF: "+ cliente.getCpf());
            System.out.println("Email: "+ cliente.getEmail());
        }
    }
}