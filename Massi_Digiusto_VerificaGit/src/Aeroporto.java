public class Aeroporto {
    private String citta;
    private double superificie;
    private Aereo aerei[];
    private Pilota piloti[];

    public Aeroporto(){}

    public Aeroporto(String citta, double superficie, Aereo aerei[], Pilota piloti[]){
        this.aerei = new Aereo[3];
        this.piloti = new Pilota[3];
        this.citta = citta;
        this.superificie = superficie;
        this.aerei = aerei;
        this.piloti = piloti;
    }

    public void setCitta(String citta){
        this.citta = citta;
    }

    public void setSuperficie(double superficie){
        this.superificie = superficie;
    }   

    public void setAerei(Aereo aerei[]){
        this.aerei = aerei;
    }

    public void setPiloti(Pilota piloti[]){
        this.piloti = piloti;
    }

    public String getCitta(){
        return citta;
    }

    public double getSuperficie(){
        return superificie;
    }

    public Aereo[] getAerei(){
        return aerei;
    }

    public Pilota[] getPiloti(){
        return piloti;
    }

    
    
}