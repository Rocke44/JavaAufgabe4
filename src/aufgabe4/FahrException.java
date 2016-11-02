package aufgabe4;

/**
 * Created by jrocke on 02.11.16.
 */
public class FahrException extends RuntimeException{
    public FahrException(){
        super("This is a FahrException");
    }
    public FahrException(String msg){
        super(msg);
    }
}
