package FakeDB;

import java.util.ArrayList;

import Dominio.Cliente;

public class ClienteFakeDB extends AbsFakeDB<Cliente>{

    @Override
    protected void AutoPreencher() {
        if(this.instancia ==null){
            this.instancia = new ArrayList<>();
        }
        this.instancia.add(new Cliente(1, "Carlos", "123456789", "Cadu@gmail.com", "123"));
        this.instancia.add(new Cliente(2, "Gabriela", "987654321", "Gabriela@gmail.com", "321"));
        this.instancia.add(new Cliente(3, "Matheus", "456852159", "Matheus@gmail.com", "456"));
        this.instancia.add(new Cliente(4, "Bruno", "789639123", "Bruno@gmail.com", "789"));
        this.instancia.add(new Cliente(5, "Luiz", "159987456", "Luiz@gmail.com", "963"));
    }
    
    public ClienteFakeDB(){
        super();
    }
}