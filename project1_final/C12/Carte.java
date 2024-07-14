import java.util.*;
//Proiect tip biblioteca
public class Carte{
    private String titlu;
    private String autor;
    private int nrPag;
    private String tip;
    
    Carte(){}
    
    Carte(String titlu, String autor, int nrPag ){
        this.titlu=titlu;
        this.autor=autor;
        this.nrPag=nrPag;
        this.tip=tip;
    }
    
    public String getTitlu(){
        return this.titlu;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public int getNrPag(){
        return this.nrPag;
    }
    
    public String getTip(){
        return this.tip;
    }
    
    @Override
    public String toString(){
        return "Cartea este intitulata " + titlu + " scrisa de " + autor + " si are " + nrPag +  " pagini ";
    }
}