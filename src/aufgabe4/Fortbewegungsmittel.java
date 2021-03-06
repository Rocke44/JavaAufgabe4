package aufgabe4;

/**
 * Created by jrocke on 02.11.16.
 */
public class Fortbewegungsmittel {
    private double position;        //in km

    final private double maxSpeed;  //in km pro h
    private double speed;           //     "

    public Fortbewegungsmittel(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    public double getPosition(){
        return this.position;
    }

    public double getSpeed(){
        return this.speed;
    }

    public void setSpeed(double speed) {
        if (speed <= 0) {
            throw new FahrException("The speed most be positive");
        }
        if (speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        } else {
            this.speed = speed;
        }
    }

    public void setPosition(double position){
        if(position<0){
            throw new FahrException("The position cannot be negativ!");
        }
        this.position = position;
    }
    public void move(double time){
        if(time<=0){
            throw new FahrException("The time must be positive!");
        }
        if(this.speed==0){throw new FahrException("You have to set the speed first!");}
        this.position += this.speed * (time / 60.0 );
    }

}
