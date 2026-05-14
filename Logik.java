import java.util.Random;
import java.util.Observable;

public class Logik extends Observable
{
    int zahl1;
    int zahl2;
    String operation;
    
    void initialisiere()
    {
        zahl1Setzen();
        zahl2Setzen();
        operationSetzen();
    }
    
    void zahl1Setzen() {
        // TODO
        setChanged();
        notifyObservers();
    }

    void zahl2Setzen() {
        // TODO
    }
    
    void operationSetzen() {
        String[] operationen = {"+", "-", "*"};
        operation = operationen[zufallszahlGeben(3)];
        setChanged();
        notifyObservers();
    }

    boolean istRichtig(int ergebnis) {
        switch (operation) {
            case "+":
                // TODO
                return false;
            case "-":
                // TODO
                return false;
            case "*":
                // TODO
                return false;
            default:
                return false;
        }
    }

    int zufallszahlGeben(int grenze) {
        // TODO
        return 0;
    }
}