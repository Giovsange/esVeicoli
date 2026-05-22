package esVeicoli;

public class Camion extends Veicolo implements Carico, Manutenzione{ 
private int maxpeso;

public Camion(){

}

public Camion(String targa,String modello,int nruote,String tipologia,int maxpeso){
super(targa, modello, nruote, tipologia);
this.maxpeso=maxpeso;
}

public int getMaxpeso(){
    return maxpeso;
}

public void setMaxpeso(int maxpeso){
    this.maxpeso=maxpeso;
}

public void trasporta(){
    System.out.println("il camion sta trasportando un carico");
}

public String toString(){
    return super.toString()+" e il suo peso è "+this.getMaxpeso();
}

public int CaricoMassimo(){
    return maxpeso;
}
public void manutenzioneOrdinaria(){
        System.out.println("Manutenzione camion eseguita");
    }
}
