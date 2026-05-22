package esVeicoli;

public class ParcoAuto {
private Veicolo[] arrayveicoli=new Veicolo[5];

public ParcoAuto(){

}
public ParcoAuto(Veicolo[] arrayveicoli){
this.arrayveicoli=arrayveicoli;
}

public Veicolo[] getArrayveicoli(){
    return arrayveicoli;
}

public void setArrayveicoli(Veicolo[] arrayveicoli){
    this.arrayveicoli=arrayveicoli;
}

public void aggiungiVeicolo(Veicolo v){
    for(int i=0;i<arrayveicoli.length;i++){
        if(arrayveicoli[i]==null){
            arrayveicoli[i]=v;
            System.out.println("Elemento "+v.getTipologia()+" aggiunto!");
            return;
            
        }
            
    }
    System.out.println("Parco Auto pieno");
}
public void mostraCaricoMassimo(Carico c){
    System.out.println("Il carico massimo è: "+c.CaricoMassimo());
}
public void eseguiManutenzione(Manutenzione m){
    m.manutenzioneOrdinaria();
}
}
