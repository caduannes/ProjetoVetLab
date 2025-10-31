package Servico;

import java.util.ArrayList;

public interface IServico<TDominio>{

    ArrayList<TDominio> browse();
    TDominio read(int codigo);
    TDominio edit(TDominio instancia);
    TDominio add(TDominio instancia);
    TDominio deleteById(int codigo);
    TDominio deleteByInstance(TDominio instancia);
}