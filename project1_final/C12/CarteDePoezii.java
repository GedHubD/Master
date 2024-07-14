public class CarteDePoezii extends Carte{
    private int nrPoezii;
    
    public CarteDePoezii(String titlu, String autor, int nrPag, int nrPoezii){
        super(titlu, autor, nrPag);
        this.nrPoezii = nrPoezii;
    }
 // Biblioteca are 2 tipuri de carti : de poezii, romane. 
 //Fiecare carte are titlu, autor, nrPag. Poeziile au si nrPoezii.  
    public int getNrPoezii(){
        return nrPoezii;
    }
    
    public String toString(){
        return super.toString() + " " + "are" + " " + nrPoezii + " poezii.";
    }
    
}