package aufgabe4;

/**
 * Created by jrocke on 02.11.16.
 */
public class Main {
    public static void main(String[] args){
        Fortbewegungsmittel sani = new Krankenwagen();
        Fortbewegungsmittel radler = new Fahrrad();
        Fortbewegungsmittel raser = new Porsche();

        try{
            sani.setSpeed(80);
            radler.setSpeed(20);
            raser.setSpeed(200);
        } catch (FahrException e){
            System.out.println(e);
        }

        try{
            sani.move(82.5);
            radler.move(510);

            sani.move(60);
            radler.move(60);
            raser.move(60);
        } catch (FahrException e){
            System.out.println(e);
        }
    }
}
