package esVeicoli;

public class Auto extends Veicolo implements Manutenzione{
    private String colore;

    public Auto(){

    }
    public Auto(String targa,String modello,int nruote,String tipologia,String colore){
    super(targa, modello, nruote,tipologia);
    this.colore=colore;
    }

    public String getColore(){
        return colore;
    }
    public void setColore(String colore){
        this.colore=colore;
    }

    public void accelera(){
        System.out.println("L'auto sta accelerando");
    }

    public void decelera(){
        System.out.println("L'auto sta decelerando");
    }
    @Override
    public String toString(){
        return super.toString()+" e il colore è: "+this.getColore();
    }
    public void manutenzioneOrdinaria(){
        System.out.println("Manutenzione auto eseguita");
    }
}
