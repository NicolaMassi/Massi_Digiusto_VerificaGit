public class Pilota {

    private int nPatente;
    private String nome;
    private String cognome;
    private String ruolo;

    public Pilota(){}

    public Pilota(int nPatente, String nome, String cognome, String ruolo){

        this.nPatente = nPatente;
        this.nome = nome;
        this.cognome = cognome;
        this.ruolo = ruolo;

    }

    public void setnPatente(int nPatente) {
        this.nPatente = nPatente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public int getnPatente() {
        return nPatente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getRuolo() {
        return ruolo;
    }
    
}
