
package com.mycompany.lsitadobletarafamilia;

import javax.swing.JOptionPane;



public class Lista {
    Nodo inicio;
    int tamaño;          
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public Lista() {
        
    }
    
    
    
    //METODO QUE VALIDA SI LA LISTA ESTA VACIA
    public boolean esvacialalista(){                   
        return inicio==null;              
    }
    
    
    public void agregarnodoalfinaldelalista(Persona valordelnodo){              
        Nodo nodonuevo=new Nodo();        
        nodonuevo.setValor(valordelnodo);        
        if(esvacialalista()){            
            if (nodonuevo.getValor().getEdad()>18) { // VALIDACION PARA QUE UN MENOS DE EDAD NO QUEDE SOLO                
                inicio=nodonuevo;      
            }else{JOptionPane.showMessageDialog(null, "Oops no hay dos adultos responsables");}
            
        }else{            
            Nodo aux=inicio;  
            
            if (nodonuevo.getValor().getEdad()>18) {
                while(aux.getSig()!=null){
                    aux=aux.getSig();
                }                
                aux.setSig(nodonuevo);                        
                nodonuevo.setAnt(aux);
            }else{                                                   
                while(aux !=null){                       
                    if(aux.getSig()==null){
                            JOptionPane.showMessageDialog(null, "Oops no hay dos adultos responsables");
                    }else{                                                                
                        if(aux.getValor().getEdad()>=18 && aux.getSig().getValor().getEdad()>=18 ){                        
                             if(aux.getValor().getSexo().equalsIgnoreCase("M") && aux.getSig().getValor().getSexo().equalsIgnoreCase("F")){                            
                                //System.out.println("Entro al M -- F");
                                nodonuevo.getValor().setApellido(aux.getValor().getApellido()+" "+aux.getSig().getValor().getApellido());                           
                            }
//                           else if(aux.getValor().getSexo().equalsIgnoreCase("F") && aux.getSig().getValor().getSexo().equalsIgnoreCase("M")){
//                                //System.out.println("Entro al F -- M");
//                                nodonuevo.getValor().setApellido(aux.getSig().getValor().getApellido()+" "+aux.getValor().getApellido());
//
//                            }                                                
                            nodonuevo.setSig(aux.getSig());                        
                            nodonuevo.setAnt(aux);
                            aux.setSig(nodonuevo);                         
                            aux=nodonuevo.getSig();                         
                            aux.setAnt(nodonuevo);                                                                                               
                            break;
                        }                    
                    }                    
                    aux=aux.getSig();
                }                                
            }                        
        }        
        tamaño++;               
    } 
    
    
//    public Lista mostraslalista2(){                  
//        Nodo aux=inicio;
//        
//        String mostrar="";
//        
//        Persona miPersona=null;
//        Lista milista=new Lista();                
//        while(aux !=null){
//            mostrar+=aux.getValor().getId()+"-"+aux.getValor().getNombre()+"-"+aux.getValor().getApellido()+"-"+aux.getValor().getSexo()+"-"+aux.getValor().getEdad()+" <=> ";
//            miPersona=new Persona(aux.getValor().getId(),aux.getValor().getNombre(), aux.getValor().getApellido(), aux.getValor().getSexo(), aux.getValor().getEdad());
//             milista.agregarnodoalfinaldelalista(miPersona);                          
//            aux=aux.getSig();
//        }  
//        System.out.println(mostrar);
//        return milista;
//    }   
    
    
    
}
