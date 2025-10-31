package FakeDB;

import Dominio.Colaborador;
import java.util.ArrayList;

public class ColaboradorFakeDB extends AbsFakeDB<Colaborador>{

    @Override
    protected void AutoPreencher(){
        if(this.instancia ==null){
            this.instancia = new ArrayList<>();
        }
        this.instancia.add(new Colaborador(1, "Luizao", "846.295.173-10", "Luizao@gmail.com", 18000.00, "58"));
        this.instancia.add(new Colaborador(2, "Noiza", "569.483.164-07", "Noiza@gmail.com", 16000.00, "43"));
    }
    
    public ColaboradorFakeDB(){
        super();
    }
}