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

        for (int [] row: sample.mayin)
        {
            for(int i : row)
            {
                System.out.print(i+"\t");
            }
            System.out.println("");
        }

        System.out.println("-----------\n");


       // System.out.println(sample.x);
        //System.out.println(sample.height);
       // System.out.println(sample.weight);

        for(int i =0; i<sample.tahta.length;i++)
        {
            for(int j=0; j<sample.tahta[i].length;j++)
            {
                System.out.print(sample.tahta[i][j]);
            }
            System.out.println("");
        }

        System.out.println("-----------\n");

        for(int i =0; i<sample.tahtaHarita.length;i++)
        {
            for(int j=0; j<sample.tahtaHarita[i].length;j++)
            {
                System.out.print(sample.tahtaHarita[i][j]);
            }
            System.out.println("");
        }

        for(int i =0; i<sample.tahtaOyun.length;i++)
        {
            for(int j=0; j<sample.tahtaOyun[i].length;j++)
            {
                System.out.print(sample.tahtaOyun[i][j]);
            }
            System.out.println("");

        }
       // System.out.println(sample.tahtaHarita.length +" - " +sample.tahtaHarita[2].length);
/*

        System.out.print("TAhmin Satır koordinat: ");
        int h2 = in.nextInt();
        System.out.print("TAhmin Sütun koordinat: ");
        int w2 = in.nextInt();
*/
    }
}