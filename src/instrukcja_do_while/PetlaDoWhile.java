package instrukcja_do_while;

import java.io.*;

public class PetlaDoWhile {

    public static void main(String[] args)
            throws IOException
    {
        try
        {
            int x, y = 0, i = 0;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("podaj X: ");
            x = Integer.parseInt(br.readLine());

            System.out.println("wartosc funkcji y = 3x (dla i < 5):");

            do {
                y = 3 * x - 4;
                System.out.println("x = " + x + '\t' + "y = " + y + '\t');
                x++;
                i++;
            }
            while (i < 5);

        }
        catch (NumberFormatException exception)
        {
            System.out.println("blad, podaj liczbe");
        }
    }

}
