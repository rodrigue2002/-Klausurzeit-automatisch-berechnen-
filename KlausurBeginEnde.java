import java.util.*;
public class KlausurBeginEnde {
    public static void main(String[] args){
        System.out.println("geben Sie die Stunden des Klausursbeginns ein: ");
        Scanner sc = new Scanner(System.in);
        int stunden = sc.nextInt();
        assert stunden >= 0 && stunden <= 24;
        System.out.println("geben Sie die Minuten des Klausursbeginns ein: ");
        int minuten = sc.nextInt();
        assert minuten >= 0 && minuten <= 60;
        System.out.println("geben Sie die Dauer der Klausur in Minuten ein: ");
        int dauer = sc.nextInt();
        setDauer(minuten, stunden, dauer); 
    }
    
    public static void  setDauer (int minuten, int stunden, int dauer){
        int min2;
        int std2;
        int std = dauer/60;
        int min = dauer%60;
        System.out.println("Start: " + stunden + ":" + minuten);
        System.out.println("Dauer: " + std + ":" + min);
        if(stunden + std<=23 && minuten + min <60){
        System.out.println("Ende: " + (stunden + std) + ":" + (minuten + min));}

          else if(stunden + std + (minuten + min)/60 == 24){
                 std2 = 0; 
                min2 = (minuten + min)%60;
                System.out.println("Ende: " + std2 + ":" + min2);
            }
        
        else {
             std2 = (stunden + std)%24 + (minuten + min)/60;
             min2 = (minuten + min)%60;
            System.out.println("Ende: " + std2 + ":" + min2);
    }

    

}
}


