package FakeDB;

import java.util.ArrayList;

import Dominio.Veterinario;

public class VeterinarioFakeDB extends AbsFakeDB<Veterinario> {

    @Override
    protected void AutoPreencher() {
        if(this.instancia == null){
            this.instancia = new ArrayList<>();
        }
        this.instancia.add(new Veterinario(1, "Larissa", "1.649.794", "486.918.746-59", "larissa@gmail.com", "948613746982-1"));
        this.instancia.add(new Veterinario(2, "Caio", "4.972.643", "946.726.159-40", "caio@gmail.com", "416837806431-7"));
    }
    
    public VeterinarioFakeDB(){
        super();
    }   
}
