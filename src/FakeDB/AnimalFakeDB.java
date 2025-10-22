package FakeDB;

import java.util.ArrayList;

import Dominio.Animal;

public class AnimalFakeDB extends AbsFakeDB<Animal>{

    @Override
    protected void AutoPreencher() {
        if(this.instancia ==null){
            this.instancia = new ArrayList<>();
        }
        this.instancia.add(new Animal(1, "Nega", "Gato", "Preta","2023-01-10"));
        this.instancia.add(new Animal(2, "Frederico Fassev", "Gato", "Rajado", "2023-08-19"));
    }

    public AnimalFakeDB(){
        super();
    }
}