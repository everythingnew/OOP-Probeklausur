public class Main
{
    public static void main(String[] args)
    {
        //ignorieren , nur zum Testen
        Aufgabe1 aufgabe1 = new Aufgabe1();
        System.out.println("aufgabe A a) = " + aufgabe1.gibGroessteZahl(new int[]{1,1,2,5},new int[]{1,1,8,9}));
        System.out.println("aufgabe A b) = " + aufgabe1.entferneDoppelteWerte(new int[]{1,1,2,5}));
        
        Mitglied mitglied1 = new Mitglied();
        System.out.println("mitglied.getSparten() = " + mitglied1.getSparten());
        Mitglied mitglied2 = new Mitglied(001,"Max");
        System.out.println("mitglied2.getName() = " + mitglied2.getName());
        System.out.println("mitglied2.getMitgliedsnr() = " + mitglied2.getMitgliedsnr());
        System.out.println("mitglied2.getSparten() = " + mitglied2.getSparten());
        mitglied2.addSparte("Volleyball");
        System.out.println("mitglied2.getSparten() = " + mitglied2.getSparten());
        
    }
}
