public class CarteRoman extends Carte{
    private String tip;
    
    public CarteRoman(){}
    
    public CarteRoman(String titlu, String autor, int nrPag, String tip){
        super(titlu, autor, nrPag);
        this.tip=tip;
        
    }
    // Biblioteca are 2 tipuri de carti : de poezii, romane. 
    //Fiecare carte are titlu, autor, nrPag. Romanele au si tip (ex: dragoste, politist etc.).  
    public String getTip(){
        return this.tip;
    }
    //toString pentru exit 
    public String toString(){
        return super.toString() + "de tipul " + tip;
    }
    
}