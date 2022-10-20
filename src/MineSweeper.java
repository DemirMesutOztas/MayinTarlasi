import java.util.Arrays;
import java.util.Random;

public class MineSweeper
{
    int weight, height;
    int x;
    int [][] mayin = new int[x][2];
    String [][] tahta = new String[weight][height];
    String [][] tahtaHarita = new String[weight][height];

    String [][] tahtaOyun = new String[weight][height];


    MineSweeper(int w, int h)
    {
        this.weight = w;
        this.height = h;
        this.x = (w*h)/4;
        this.tahta = new String[this.height][this.weight];
        this.tahtaHarita = new String[this.height][this.weight];
        this.tahtaOyun = new String[this.height][this.weight];
        this.doldur();
        this.mayinArea();
        this.doldurSayi(this.tahtaHarita);

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

    void doldurSayi(String [][] map)
    {
        int x, y;
        int count=0;

        for(int i = 0; i<map.length; i++)
        {
            for(int j = 0; j<map[i].length; i++)
            {
                if(map[i][j] == " * ")
                {
                    continue;

                }
                else if(map[i][j+1] == " * " && j+1<=map[i].length) //sağ
                {
                    count++;
                }
                else if(j >=1) //sol
                {
                    if(map[i][j-1] == " * " )
                        count++;
                }
                else if( i+1 <=map.length) //asağı
                {
                    System.out.println( i+1);
                    if(map[i+1][j] == " * " )
                        count++;
                }
                else if(j >= 1 ) //yukarı
                {
                    if(map[i][j-1] == " * " )
                        count++;
                }
                else if( j>= 1 && i >= 1) //solüstçarpraz
                {
                    if(map[i-1][j-1] == " * ")
                        count++;
                }
                else if( j+1 <= map[i].length && i >= 1) //sağüstçapraz
                {
                    if(map[i-1][j+1] == " * ")
                        count++;
                }
                else if(i+1 <= map.length && j >= 1) //solaltçapraz
                {
                    if(map[i+1][j-1] == " * " )
                        count++;
                }
                else if(i+1 <= map.length && j+1 <= map[i].length) //sağaltçapraz
                {
                    if(map[i+1][j+1] == " * ")
                        count++;
                }

                for(int i2 = 0; i2<map.length; i2++)
                {
                    for(int j2 = 0; j2<map[i2].length; j2++)
                    {

                        map[i2][j2]= String.valueOf(count);
                    }

                }

            }
        }
    }





}
