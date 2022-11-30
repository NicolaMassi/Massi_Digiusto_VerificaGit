import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto();

        aeroporto = InserimentoAeroporto();
        
        System.out.println("L'aeroporto di " + aeroporto.getCitta() + " ha una superficie di " + aeroporto.getSuperficie());

    }
    public static Aeroporto InserimentoAeroporto(){
        Scanner input = new Scanner(System.in);
        Aeroporto aeroporto = new Aeroporto();
        Aereo aerei[];
        Pilota piloti[];
        String citta;
        double superficie;
       
        System.out.println("Inserimento dati aeroporto\n\n");
        
        System.out.println("Inserire la citta' dell'aeroporto: ");
        citta = input.nextLine();

        System.out.println("Inserire la superficie dell'aeroporto: ");
        superficie = input.nextDouble();
        input.nextLine();

        inserimentoAerei(aerei);
        inseriemntoPiloti(piloti);

        aeroporto = new Aeroporto(citta, superficie, aerei, piloti);
        return aeroporto;
    }
}
