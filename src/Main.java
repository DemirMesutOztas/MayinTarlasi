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

        System.out.println("----------------------------");
        sample.print(sample.tahta);

        System.out.println("----------------------------");
        sample.print(sample.tahtaHarita);

        sample.run();

    }
}