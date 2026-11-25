
/**
 * Write a description of class Formel20 here.
 *
 * @author fahim shafahi    
 * @version 0.0.0
 */
public class Formel20
{
    private int z;
    private int e;
    // Attributes are defined 
    
    // jetzt erstellen wir den Konstruktor 
    public Formel20(){
        // die Methode wird aufgerufen 
        berechne(1,3,5);
        berechne(2,-1,3);
    }
    
    // jetzt erstellen wir die erste Methode berechne. 
    public int berechne (int x, int y ){
        z = (x + 3) * (y - 2);        
        return z;
    }
    // die zweite Methode mit 3 Parametern wird erstellet
    public int berechne (int a, int b, int c){
        e = berechne (b, 5) + berechne(a, c) + berechne(c, b);
        System.out.println("the value is "+ e +" .");
        return e;
    }
}