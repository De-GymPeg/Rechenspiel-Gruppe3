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
        zahl1 = zufallszahlGeben(100);
        setChanged();
        notifyObservers();
    }

    void zahl2Setzen() {
        zahl2 = zufallszahlGeben(100);
        setChanged();
        notifyObservers();
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
                return zahl1 + zahl2 == ergebnis;
            case "-":
                // TODO
                return zahl1 - zahl2 == ergebnis;
            case "*":
                // TODO
                return zahl1 * zahl2 == ergebnis;
            default:
                return false;
        }
    }

    int zufallszahlGeben(int grenze) {
        Random random = new Random();
        return random.nextInt(grenze);
    }
}