/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author EADE
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[][];
        x = new int[3][3];
        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;
        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;
        x[2][0] = 7;
        x[2][1] = 8;
        x[2][2] = 9;
        
        for (int i=0;i<3;i++) 
        {
            for (int p=0;p<3;p++)
            {
                System.out.println ("x["+p+"]["+p+"] = "+x[i][p]);
                              
            }
        }
    }
    
}
