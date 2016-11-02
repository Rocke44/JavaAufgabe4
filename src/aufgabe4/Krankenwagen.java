package aufgabe4;

/**
 * Created by jrocke on 02.11.16.
 */
public class Krankenwagen extends Fortbewegungsmittel {
    private boolean blaulicht;

    public Krankenwagen() {
        super(160);
        this.blaulicht=false;
    }

    public void blaulichtAnschalten(){
        this.blaulicht = true;
    }
    public void blaulichtAusschalten(){
        this.blaulicht = false;
    }

    @Override
    public void move(double time){
        if(this.speed>50){
            this.blaulichtAnschalten();
            System.out.println("tatütata");
        }
        super.move(time);
    }

}
