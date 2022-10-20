import java.util.Arrays;
import java.util.Random;

public class MineSweeper
{
    int weight, height;
    int x;
    int [][] mayin = new int[x][2];
    String [][] tahta = new String[weight][height];
    String [][] tahtaHarita = new String[weight][height];


    MineSweeper(int w, int h)
    {
        this.weight = w;
        this.height = h;
        this.x = (w*h)/4;
        this.tahta = new String[this.height][this.weight];
        this.tahtaHarita = new String[this.height][this.weight];
        this.doldur();
        this.mayinArea();

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
     void mayinArea()
    {

        Random r = new Random();
        this.mayin = new int[this.x][2];
        int ara, ara2;

        int []tekDizi = new int[this.x];

        for(int j = 0 ;j<this.x; j++)
        {
            ara = r.nextInt(this.height);
            ara2 = r.nextInt(this.weight);


            this.mayin[j][0]=ara;
            this.mayin[j][1]=ara2;


            this.tahtaHarita[ara][ara2]= " * ";
        }


    }





}
