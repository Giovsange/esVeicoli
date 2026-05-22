package esVeicoli;

public class Moto extends Veicolo implements Manutenzione{
private String carburante;

public Moto(){

}

public Moto(String targa,String modello,int nruote,String tipologia,String carburante){
super(targa, modello, nruote, tipologia);
this.carburante=carburante;
}

public String getCarburante(){
    return carburante;
}

public void getCarburante(String carburante){
    this.carburante=carburante;
}

public void impenna(){
    System.out.println("La moto impenna");
}


@Override
public String toString(){
    return super.toString()+" e il suo carburante è: "+this.getCarburante();
}

public void manutenzioneOrdinaria(){
        System.out.println("Manutenzione moto eseguita");
    }
}
