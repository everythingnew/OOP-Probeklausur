import java.util.ArrayList;

public class Aufgabe1
{
    //Aufgabe A a)
    public int gibGroessteZahl(int[] a,int[] b){
        //größte Zahl mit 0 initialisieren
        int groessteZahl =0;

        //mit for-Schleife durch die Array a gehen
        for (int i = 0; i <a.length ; i++)
        {
            //für jedes Element an der stelle i prüfen,ob das größer als unsere größte Zahl ist
            if(a[i] >groessteZahl){
                groessteZahl =a[i];
            }
        }

        // dasselbe mit array b machen
        for (int i = 0; i <b.length ; i++)
        {
            if(b[i] >groessteZahl){
                groessteZahl =b[i];
            }
        }

        //die größte Zahl zurückgeben
        return groessteZahl;
    }

    //Aufgabe B b)
    public ArrayList<Integer> entferneDoppelteWerte(int[] x){
        //neue Liste die zurückgegeben werden muss als leere List intialisieren
        ArrayList<Integer> listeOhneDoppelteWerte = new ArrayList<>();

        //mit for Schleife durch die Array gehen
        for (int i = 0; i <x.length ; i++)
        {
            //prüfen,ob das Element an der Stelle i in Array x in unserer Liste existiert
         if (! listeOhneDoppelteWerte.contains(x[i])){
             // wenn das nicht der Fall ist, dann in die List hinzufügen
             //Hinweis: mit "!" kann man die Aussage negieren
             listeOhneDoppelteWerte.add(x[i]);
         }
        }
        //die Liste zurückgeben
        return listeOhneDoppelteWerte;
    }
}
