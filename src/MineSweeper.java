import java.util.Random;
import java.util.Scanner;

public class MineSweeper
{
    int weight, height;
    int x;
    String [][] tahta = new String[weight][height];
    String [][] tahtaHarita = new String[weight][height];
    String [][] tahtaNumber= new String[weight][height];



    MineSweeper(int w, int h)
    {
        this.weight = w;
        this.height = h;
        this.x = (w*h)/4;
        this.tahta = new String[this.height][this.weight];
        this.tahtaHarita = new String[this.height][this.weight];
        this.doldur();
        this.mayinDoldur();

    }

    void doldur()
    {
        for(int i = 0; i<this.tahta.length; i++)
        {
            for(int j = 0; j<this.tahta[i].length; j++)
            {
                this.tahta[i][j]=" - ";
            }
        }

        for(int i = 0; i<this.tahtaHarita.length; i++)
        {
            for(int j = 0; j<this.tahtaHarita[i].length; j++)
            {
                this.tahtaHarita[i][j]=" - ";
            }
        }

    }
     void mayinDoldur()
    {
        Random r = new Random();
        int ara, ara2;
        int mayin=this.x;

        while(mayin>0)
        {
            ara = r.nextInt(this.height);
            ara2 = r.nextInt(this.weight);

            if(this.tahtaHarita[ara][ara2]!=" * ")
            {
                this.tahtaHarita[ara][ara2]=" * ";
                mayin--;
            }

        }

    }
    void run()
    {
        this.tahtaNumber = new String[this.height][this.weight];
        Scanner out = new Scanner(System.in);
        boolean durum = true;

        do {
            System.out.println("Satır giriniz:");
            int row = out.nextInt();

            if (row > this.height-1 || row < 0)
            {
                System.out.println("Aralık dışı satır girdiniz");
                continue;
            }

            System.out.println("Sütun giriniz:");
            int column = out.nextInt();

            if (column > this.weight-1 || column < 0)
            {
                System.out.println("Aralık dışı sütun girdiniz");
                continue;
            }

            int sayi2 = this.control(row, column);

            if(sayi2==-500)
            {
                System.out.println("Mayına bastınız. Oyun bitti!");
                String sayi=" * ";
                durum=false;
                tahta[row][column]=sayi;
                System.out.println("GAME OVER \n");
                this.print(tahta);

            }
            else
            {
                tahta[row][column]= " " + sayi2 + " ";
                this.print(tahta);
            }

        } while (durum);

    }

    int control(int x, int y)
    {
        int counter=0;
       // System.out.println(x+"-"+y+"-"+tahtaHarita[x][y]);
        if(this.tahtaHarita[x][y]==" * ")
        {
            return -500;
        }
        else if(this.tahtaHarita[x][y]==" - ")
        {
            if( x+1<=this.height-1) //alt
            {
                if(this.tahtaHarita[x+1][y]==" * ")
                {
                    counter++;
                }
            }
            if(x>0)//üst
            {
                if (this.tahtaHarita[x - 1][y] == " * ")
                {
                    counter++;
                }
            }
            if(y+1<=this.weight-1)//sağ
            {
                if(this.tahtaHarita[x][y+1]==" * ")
                {
                    counter++;

                }
            }
            if(y>0)
            {
                if(this.tahtaHarita[x][y-1]==" * ")
                {
                    counter++;
                }
            }
            if(x>0 && y>0)
            {
                if(this.tahtaHarita[x-1][y-1]==" * ")//solUstÇarpraz
                {
                    counter++;
                }
            }
            if(x+1<=this.height-1 && y+1<=this.weight-1)
            {
                if(this.tahtaHarita[x+1][y+1]==" * ")//sağAltÇarpraz
                {
                    counter++;
                }
            }
            if(x+1<=this.height-1 && y>0)
            {
                if(this.tahtaHarita[x+1][y-1]==" * ")//solAltÇArpraz
                {
                    counter++;
                }
            }
            if(x>0 && y+1<this.weight-1)
            {
                if(this.tahtaHarita[x-1][y+1]==" * ")//sağÜstÇArpraz
                {
                    counter++;
                }
            }

        }
        return counter;

    }

    void print(String [][] ekran)
    {
        for(String [] row : ekran)
        {
            for(String j : row)
            {
                System.out.print(" "+j+" ");
            }
            System.out.println("");
        }
    }


}
