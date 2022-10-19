import java.util.Random;

public class MineSweeper
{
    int weight, height;
    int x;
    int [] mayin = new int[x];
    String [][] tahta = new String[weight][height];


    MineSweeper(int w, int h)
    {
        this.weight = w;
        this.height = h;
        this.x = (w*h)/4;
        this.tahta = new String[this.weight][this.height];

        for(int i = 0; i<this.tahta.length; i++)
        {
            for(int j = 0; j<this.tahta[i].length; j++)
            {
                this.tahta[i][j]=" - ";
            }

        }
        Random r = new Random();
        mayin = new int[this.x];
        int ara;
        while(x>0)
        {

        }
        for(int k=0; k<this.x; k++)
        {
            if(k==0)
            {

                mayin[k]=ara;
            }
            else
            {
                ara=r.nextInt(x);
                if()
            }

        }



    }
}
