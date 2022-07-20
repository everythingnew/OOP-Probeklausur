public class Main
{
    public static void main(String[] args)
    {
        //ignorieren , nur zum Testen
        Aufgabe1 aufgabe1 = new Aufgabe1();
        System.out.println("aufgabe A a) = " + aufgabe1.gibGroessteZahl(new int[]{1,1,2,5},new int[]{1,1,8,9}));
        System.out.println("aufgabe A b) = " + aufgabe1.entferneDoppelteWerte(new int[]{1,1,2,5}));
    }
}
