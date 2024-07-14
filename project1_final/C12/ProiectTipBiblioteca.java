import java.util.*;
/*
Utilizatorul va introduce de la tastatura una dintre urmatoarele comenzi: 
ADD_POEZII <titlu> <autor> <nrPag> <nrPoezii>
ADD_ROMAN <titlu> <autor> <nrPag> <tip>
AF_CARTI
AF_CARTI_SORTATE
AF_AUTOR <numeCarte>
EXIT*/
public class ProiectTipBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("comanda:" );
            String comanda_full = scanner.nextLine();
            String[] input_data = comanda_full.split("<");
            String comanda = input_data[0].trim();
            

            switch (comanda) {
                case "ADD_POEZII":
                    String numePoezie = input_data[1].trim().replace(">", "");
                    String autorPoezie = input_data[2].trim().replace(">", "");
                    int nrPag = Integer.parseInt(input_data [3].trim().replace(">", ""));
                    int nrPoezii = Integer.parseInt(input_data[4].trim().replace(">", ""));
                    System.out.println("Ai adaugat poezia " + numePoezie + 
                    " scrisa de " + autorPoezie + " cu nr de pagini " + 
                    nrPag + " in poemul cu " + nrPoezii + " poezii");
                    biblioteca.adaugaCarteDePoezii(numePoezie, autorPoezie, nrPag, nrPoezii);
                    break;
                case "ADD_ROMAN":
                    String numeRoman = input_data[1].trim().replace(">", "");
                    String autorRoman = input_data[2].trim().replace(">", "");
                    //System.out.println(input_data[3]);
                    int nrPagRoman = Integer.parseInt(input_data[3].trim().replace(">", ""));
                    String tipRoman = input_data[4].trim().replace(">", "");
                    System.out.println("Ai adaugat cartea " + numeRoman + 
                    " scrisa de " + autorRoman + " cu nr de pagini " + 
                    nrPagRoman + " de tipul: " + tipRoman);
                    biblioteca.adaugaCarteRoman(numeRoman, autorRoman, nrPagRoman, tipRoman);
                    break;
                case "AF_CARTI": //afisarea tuturor cartilor
                    biblioteca.afiseazaCarti();
                    break;
                case "AF_CARTI_SORTATE": //sortate dupa titlu alfabetic
                    biblioteca.afiseazaCartiSortate(/*Comparator.comparing(Carte::getTitlu) - referinta la metoda*/);
                    break;
                case "AF_AUTOR":
                    String numeCarte = input_data[1].trim().replace(">", "");
                    biblioteca.afiseazaAutor(numeCarte);
                    break;
                    //before release
                    /*case "AF_AUTOR ":
                    System.out.println(" ");
                    String numeCarte = scanner.nextLine();
                    biblioteca.afiseazaAutor(numeCarte);
                    break;*/
                case "EXIT":
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Comanda inexistenta!");
                    break;
            }
        }
    }
}