public class Aereo {

    private String codice;
    private int nPosti;
    private String produttore;
    private String modello;

    public Aereo(){}

    public Aereo(String codice, int nPosti, String produttore, String modello){

        this.codice = codice;
        this.nPosti = nPosti;
        this.produttore = produttore;
        this.modello = modello;

    }

    public void setCodice(String codice){
        this.codice = codice;
    }

    public void setNPosti(int nPosti){
        this.nPosti = nPosti;
    }

    public void setProduttore(String produttore){
        this.produttore = produttore;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public String getCodice(){
        return codice;
    }

    public int getNPosti(){
        return nPosti;
    }

    public String getProduttore(){
        return produttore;
    }

    public String getModello(){
        return modello;
    }

}
