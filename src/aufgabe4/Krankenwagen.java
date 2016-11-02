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

    public boolean isBlaulichtAn(){
        return this.blaulicht;
    }

    @Override
    public void setSpeed(double speed){
        if(speed>50) {
            this.blaulichtAnschalten();
        }
        super.setSpeed(speed);
    }

    @Override
    public void move(double time){
        if(this.getSpeed()>50){
            System.out.println("tatütata");
        }
        super.move(time);
    }

}
