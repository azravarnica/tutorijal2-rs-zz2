package sample;

public class Controller {
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Napravite program koji na ekranu ispisuje sve brojeve između 1 i n
        koji su djeljivi sa sumom svojih cifara, pri čemu se n unosi sa tastature.
        U programu se obavezno treba nalaziti funkcija sumaCifara.
        */
        int n;
        Scanner S=new Scanner(System.in);
        n=S.nextInt();
        for (int i = 1; i < n; i++) {
            if(i%sumaCifara(i) == 0) System.out.println(i);
        }
    }

    private static int sumaCifara(int i) {
        int suma = 0;
        while(i != 0){
            suma = suma + (i%10);
            i= i/10;
        }
        return suma;
    }
}