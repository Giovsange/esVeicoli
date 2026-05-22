package esVeicoli;

public abstract class Veicolo {
private String targa;
private String modello;
private int nruote;
private String tipologia;

public Veicolo(){

}
public Veicolo(String targa,String modello,int nruote,String tipologia){
this.targa=targa;
this.modello=modello;
this.nruote=nruote;
this.tipologia=tipologia;
}


public String getTarga(){
    return targa;
}

public void setTarga(String targa){
    this.targa=targa;
}

public String getModello(){
    return modello;
}

public void setModello(String modello){
    this.modello=modello;
}

public int getNruote(){
    return nruote;
}

public void setNruote(int nruote){
    this.nruote=nruote;
}


public String getTipologia(){
    return tipologia;
}

public void setTipologia(String tipologia){
    this.tipologia=tipologia;
}
@Override
public String toString(){
    return "Il veicolo ha la targa: "+this.getTarga()+", modello: "+this.getModello()+" e ha "+this.getNruote()+" ruote";
}
}
