import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto();

        aeroporto = InserimentoAeroporto();

        String listaAerei = "";

        Aereo aereiAux[] = new Aereo[3];
        aereiAux = aeroporto.getAerei();

        for(int i = 0; i < aereiAux.length; i++){
            listaAerei += ", " + aereiAux[i];
        }
        
        System.out.println("L'aeroporto di " + aeroporto.getCitta() + " ha una superficie di " + aeroporto.getSuperficie() + ". Gli aerei disponibili sono "+ listaAerei +". Ci lavorano i piloti "+ );

    }
    public static Aeroporto InserimentoAeroporto(){
        Scanner input = new Scanner(System.in);
        Aeroporto aeroporto = new Aeroporto();
        Aereo aerei[] = new Aereo[3];
        Pilota piloti[] = new Pilota[3];
        String citta;
        double superficie;
       
        System.out.println("Inserimento dati aeroporto\n\n");
        
        System.out.println("Inserire la citta' dell'aeroporto: ");
        citta = input.nextLine();

        System.out.println("Inserire la superficie dell'aeroporto: ");
        superficie = input.nextDouble();
        input.nextLine();

        inserimentoAerei(input, aerei);
        inserimentoPiloti(input, piloti);

        aeroporto = new Aeroporto(citta, superficie, aerei, piloti);
        return aeroporto;
    }

    public static void inserimentoAerei(Scanner input, Aereo[] aerei){

        String codiceAux, produttoreAux, modelloAux;
        int nPostiAux;

        for(int i = 0; i < aerei.length; i++){

            System.out.print("Inserire il codice dell'aereo: ");
            codiceAux = input.nextLine();

            System.out.print("Inserire il numero di posti dell'aereo: ");
            nPostiAux = input.nextInt();

            System.out.print("Inserire il produttore dell'aereo: ");
            produttoreAux = input.nextLine();

            System.out.print("Inserire il modello dell'aereo: ");
            modelloAux = input.nextLine();

            System.out.println("\n");

            aerei[i] = new Aereo(codiceAux, nPostiAux, produttoreAux, modelloAux);

        }

        System.out.println("\n");

    }

    public static void inserimentoPiloti(Scanner input, Pilota[] piloti){

        int nPatenteAux;
        String nomeAux, cognomeAux, ruoloAux;

        for(int i = 0; i < piloti.length; i++){

            System.out.print("Inserire il numero della patente del pilota: ");
            nPatenteAux = input.nextInt();

            System.out.print("Inserire il nome del pilota: ");
            nomeAux = input.nextLine();

            System.out.print("Inserire il cognome del pilota: ");
            cognomeAux = input.nextLine();

            ruoloAux = sceltaRuolo(input);

            System.out.println("\n");

            piloti[i] = new Pilota(nPatenteAux, nomeAux, cognomeAux, ruoloAux);
            
        }
    }

    public static String sceltaRuolo(Scanner input){

        int scelta;

        do{

            System.out.println("Scelta del ruolo dei piloti");
            System.out.println("1- Comandante");
            System.out.println("2- Primo ufficiale");
            scelta = input.nextInt();

            if(scelta < 1 || scelta > 2)
                System.out.println("Hai scelto un valore sbagliato. RIPROVA");

        }while(scelta < 1 || scelta > 2);

        if(scelta == 1)
            return "Comandante";

        return "Primo ufficiale";

    }
    
}
