
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johan C
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main  = new Main();
        System.out.println(Arrays.toString(main.calculateScores("ABCBACC")));
    }
    
    public int[] calculateScores(String str) {
        int[] result = new int[3];
        char[] letters = str.toUpperCase().toCharArray();
        
        for(int i = 0; i < letters.length; i++){
            if(letters[i] == 'A'){
                result[0] += 1;
            }
            if(letters[i] == 'B'){
                result[1] += 1;
            }
            if(letters[i] == 'C'){
                result[2] += 1;
            }
        }
        return result;
    }
    
}
