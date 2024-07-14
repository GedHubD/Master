import java.util.*;
/*Aplicatia lucreaza cu o singura biblioteca si trebuie sa aiba urmatoarele functionalitati:
adaugaRoman
adaugaPoezie
afiseazaCarti
afiseazaCartiSortat
afiseazaAutor
exit*/
class Biblioteca{
    //lista de functionalitati
    private List<Carte> carti = new ArrayList<>();
    
    
    public void adaugaCarteRoman(String titlu, String autor, int nrPag, String tip){
        CarteRoman roman = new CarteRoman(titlu, autor, nrPag, tip);
        carti.add(roman);
    }
    
    public void adaugaCarteDePoezii(String titlu, String autor, int nrPag, int nrPoezii){
        CarteDePoezii poezie = new CarteDePoezii(titlu, autor, nrPag, nrPoezii);
        carti.add(poezie);
    }
    
    public void afiseazaCarti(){
        for(Carte carte: carti ){
            System.out.println(carte);
        }
    }
    
    
    public void afiseazaCartiSortate() {
        Collections.sort(carti, new Comparator<Carte>() {
            
            @Override
            public int compare(Carte carte1, Carte carte2) {
                return carte1.getTitlu().compareToIgnoreCase(carte2.getTitlu());
            }
        });
        
        for (Carte carte : carti) {
            System.out.println("Titlu: " + carte.getTitlu() + ", Autor: " + carte.getAutor() + ", Nr. pagini: " + carte.getNrPag() + ", de tipul " + carte.getTip());
        }
    }
    
    public void afiseazaAutor(String titlu) {
        boolean gasit = false;
        
        for(Carte carte:carti){
           System.out.println(carte.getTitlu());
           
           if (carte.getTitlu().equals(titlu)){
               gasit = true;
               System.out.println("Autorul cartii " + carte.getTitlu() + " este "+ carte.getAutor());
           }
           
        }
        
        try{
            if(!gasit) {
            throw new CarteInexistentaException("Cartea cu titlul '" + titlu + "' nu există în bibliotecă");
            }
        }
        catch(CarteInexistentaException e){
            System.err.println(e.getMessage());
        }  
    }
}

    





    

