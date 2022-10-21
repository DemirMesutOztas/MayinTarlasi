import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Satır sayısı: ");
        int h = in.nextInt();
        System.out.print("Sütun sayısı: ");
        int w = in.nextInt();

        MineSweeper sample = new MineSweeper(w, h);

        System.out.println("----------------------------\n");

        /*
        for(int i =0; i<sample.tahta.length;i++)
        {
            for(int j=0; j<sample.tahta[i].length;j++)
            {
                System.out.print(sample.tahta[i][j]);
            }
            System.out.println("");
        }
*/
        sample.print(sample.tahta);
        System.out.println("--------------******---------\n");
        sample.print(sample.tahtaHarita);
    /*
        for(int i =0; i<sample.tahtaHarita.length;i++)
        {
            for(int j=0; j<sample.tahtaHarita[i].length;j++)
            {
                System.out.print(sample.tahtaHarita[i][j]);
            }
            System.out.println("");
        }

        for(int i =0; i<sample.tahtaNumber.length;i++)
        {
            for(int j=0; j<sample.tahtaNumber[i].length;j++)
            {
                System.out.print(sample.tahtaNumber[i][j]);
            }
            System.out.println("");

        }
        */

        sample.run();

    }
}