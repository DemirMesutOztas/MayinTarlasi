import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        MineSweeper sample = new MineSweeper(w, h);

        for (int i: sample.mayin)
        {
            System.out.println(i);
        }

    }
}