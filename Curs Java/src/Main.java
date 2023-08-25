// Introducere in java by Petru 😎

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Alt+F5 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing F9.
// Press Ctrl+F5 or click the green arrow button in the gutter to run the code.

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        //-----afisare----//
        System.out.print("Dai si tu o bere ?\n");  // afisarea unui text

        //-----variabile----//
        int x = 123;  //initializare
        double y = 3.14;
        float z = 3.1357763F;     // tipuri de variabile
        boolean P = true;

        String Cuvant = "Petru";
        System.out.print(String.valueOf(x));  // afisarea unei variabile
        System.out.print('\n');
        System.out.print(y);
        System.out.print('\n');

        //-----Interschimbarea a 2 variabile----//

        String V = "Bagdasar";
        String I = "Arseni";
        String aux;

        aux = V;
        V = I;                        //interschimbarea se realizeaza la fel ca in c++ & python
        I = aux;

        System.out.printf(String.valueOf(V));
        System.out.print('\n');
        System.out.printf(String.valueOf(I));
        System.out.print('\n');

        //-----Introducerea de la tastatura----//

        Scanner introducere_by_user = new Scanner(System.in);    //initializarea  unui scaner prin intermediul caruia se introcuc date de catre utilizator la tastatura

        System.out.print("Cum te numesti \n");
        String name = introducere_by_user.nextLine();
        System.out.print("Cati ani ai cumetre \n");
        String age = introducere_by_user.nextLine();

        System.out.print("Buna " + name);
        System.out.print( "Ai " + age + " ani");
    }
}

