package FakeDB;

import Dominio.Cliente;
import java.util.ArrayList;

public class ClienteFakeDB extends AbsFakeDB<Cliente>{

    @Override
    protected void AutoPreencher() {
        if(this.instancia ==null){
            this.instancia = new ArrayList<>();
        }
        this.instancia.add(new Cliente(1, "Carlos", "123.456.789-94", "Cadu@gmail.com", "123"));
        this.instancia.add(new Cliente(2, "Gabriela", "987.654.321-67", "Gabriela@gmail.com", "321"));
        this.instancia.add(new Cliente(3, "Matheus", "456.852.159-13", "Matheus@gmail.com", "456"));
        this.instancia.add(new Cliente(4, "Bruno", "789.639.123-10", "Bruno@gmail.com", "789"));
        this.instancia.add(new Cliente(5, "Luiz", "159.987.456-49", "Luiz@gmail.com", "963"));
    }
    
    public ClienteFakeDB(){
        super();
    }
}