package esVeicoli;
public class esVeicoli {
    public static void main(String[] args) throws Exception {
        Veicolo[] v = new Veicolo[5];
        ParcoAuto parco = new ParcoAuto(v);
        Auto a1=new Auto("T1", "Panda", 4, "Auto", "Blu");
        Moto m1=new Moto("T2", "Yamaha", 2, "Moto", "Benzina");
        Camion c1=new Camion("T3", "Volvo", 4, "Camion" ,5);
        parco.aggiungiVeicolo(a1);
        System.out.println(a1.toString());
        parco.aggiungiVeicolo(m1);
        System.out.println(m1.toString());
        parco.aggiungiVeicolo(c1);
        System.out.println(c1.toString());
        parco.mostraCaricoMassimo(c1);
        
        a1.manutenzioneOrdinaria();
        m1.manutenzioneOrdinaria();
        c1.manutenzioneOrdinaria();
        m1.impenna();
        a1.accelera();
        a1.decelera();
    }
}
