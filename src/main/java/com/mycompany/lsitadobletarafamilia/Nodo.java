
package com.mycompany.lsitadobletarafamilia;

public class Nodo {
    Nodo sig,ant;
    Persona valor;

    public Nodo() {
        sig=null;
        ant=null;
        valor=null;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Persona getValor() {
        return valor;
    }

    public void setValor(Persona valor) {
        this.valor = valor;
    }     
    
    
    
//    Lista miLista=new Lista();
//        Persona miPersona=new Persona(1, "Kevin", "Narvaez", "M", 20);
//        Persona miPersona1=new Persona(1, "Daniela", "Lizarazo", "M", 20);
//        
//        Persona miPersona2=new Persona(1, "Carlos", "Suarez", "M", 10);
//        Persona miPersona3=new Persona(1, "Oscar", "Sastoque", "M", 20);
//        Persona miPersona4=new Persona(1, "Andrea", "Gonzalez", "F", 8);        
//        Persona miPersona5=new Persona(1, "Paola", "Murillo", "F", 30);
//        
//        
//        miLista.agregarnodoalfinaldelalista(miPersona);
//        miLista.agregarnodoalfinaldelalista(miPersona1);
//        miLista.agregarnodoalfinaldelalista(miPersona2);
//        miLista.agregarnodoalfinaldelalista(miPersona3);
//        miLista.agregarnodoalfinaldelalista(miPersona4);
//        miLista.agregarnodoalfinaldelalista(miPersona5);
//        miLista.agregarnodoalfinaldelalista(miPersona2);
//        miLista.agregarnodoalfinaldelalista(miPersona2);
//        
//        miLista.mostraslalista();
}
    
