package nevezzunk;

import java.util.Scanner;

public class Nevezzunk {

    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        System.out.print("Írja be a teljes nevét: ");
        String nevTeljes = bemenet.nextLine();
        
        
        System.out.println("Nagybetűs: " + nevTeljes.toUpperCase());
        System.out.println("Szókezdők nagybetűsek: "+Metodusok.firstUpper(nevTeljes));
        System.out.println("Kisbetűs: " + nevTeljes.toLowerCase());
        System.out.println("Ennyi karakterből áll a neve:" + nevTeljes.length());
        int szokozindex1 = nevTeljes.indexOf(' ');
        System.out.println("A névben az 1.  szóköz helye: " + szokozindex1);
        int szokozindex2 = nevTeljes.lastIndexOf(' ');
        System.out.println("A névben a 2. szóköz helye:" + szokozindex2);
        
        String[] reszek = nevTeljes.split(" ");
        String nevVezetek = reszek[0];
        String nevKereszt = reszek[1];
        System.out.println("1. keresztnév kezdő pozíciója:" );
        System.out.println("2. keresztnév kezdő pozíciója:");
        System.out.println("Vezetéknév: " + nevVezetek);
        System.out.println("Keresztnév: " + nevKereszt);
        System.out.println("Vezetéknév hossza: " + nevVezetek.length());
        System.out.println("Keresztnév hossza: " + nevKereszt.length());
        System.out.println("Névegyesítés: "+nevVezetek+" "+nevKereszt);
        System.out.println("Új név: ");
    }
    
}