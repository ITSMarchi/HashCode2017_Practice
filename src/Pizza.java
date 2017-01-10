
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pizza {

    
    static int r = 0, c = 0, l, h;
    static char sas[][] = new char[1000][1000];
    public static void main(String[] args) {

        
        int i;
        int cont=0;
        boolean cond = true;
        String path = "C:\\Users\\5D_2016-17\\Downloads\\small.in";
        String sa[];
        
        String s;
        File file = new File(path);
        FileReader fr;
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            s = br.readLine();
            while (s != null) {
                if (cond) {
                    sa = s.split(" ");
                    r = Integer.parseInt(sa[0]);
                    c = Integer.parseInt(sa[1]);
                    l = Integer.parseInt(sa[2]);
                    h = Integer.parseInt(sa[3]);
                    cond = false;
                }
                else
                {
                    
                    for(i = 0; i < s.length(); i++)
                    {
                        sas[cont][i] = s.charAt(i);
                    }
                    cont++;
                }
                  
                s = br.readLine();
            }
            System.out.println("min: " + l + " max: " + h);
            for( i = 0; i < r; i++)
                    {
                        for(int j = 0; j < c; j++)
                        {
                            System.out.print(sas[i][j]);
                        }
                        System.out.println();
                    }
            
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pizza.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pizza.class.getName()).log(Level.SEVERE, null, ex);
        }
        calcolaBlocchettieheheh();
    }
    
    public static void calcolaBlocchettieheheh()
    {
        System.out.print("hehehehehehe");
        int min = l*2;
        int max = h;
        ArrayList k = new ArrayList();
        ArrayList comb = new ArrayList();
        for (int i = min; i<=max; i++)
        {
            for(int j = 1; j <= (i/2) ; j++)
            {
                if(i%j == 0)
                {
                    k = new ArrayList();
                    k.add(i);
                    k.add(i/j);
                    comb.add(k);
                }   
            }
        }
        for(int i=0; i < comb.size(); i++)
        {
            System.out.print(comb.get(i));
        }
    }
}
