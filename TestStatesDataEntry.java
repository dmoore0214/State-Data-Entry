
package statesdataentry;

/**
 * File: StatesDataEntry.java
 * Author: Danielle Moore
 * Date: October 3, 2020
 */
import java.util.Scanner;
import java.util.Arrays;
public class TestStatesDataEntry {
    StatesDataEntry EnterUser = new StatesDataEntry(); 
    String [][] StateInfo = EnterUser.getStateInfo();
    static int search(String [][] StateInfo, String State){
        for (int j = 0; j < StateInfo.length; j++){
            if (StateInfo[j].equals(State)){
                return j;
            }
        }
    return -1;
    }
    public static void main(String args[]){
    
        StatesDataEntry EnterUser = new StatesDataEntry();        
        Scanner scannerIn = new Scanner(System.in); 
        String [][] StateInfo = EnterUser.getStateInfo();
        
        System.out.println("Enter State or None to exit: ");
        String State = scannerIn.nextLine();

        
        int j = search(StateInfo, State);
            if (j==-1){
                System.out.println("Unknown State");
            }
            else{
            System.out.println("State is: " + StateInfo[j][0]);
            System.out.println("Bird is: " + StateInfo[j][1]);
            System.out.println("Flower is: " + StateInfo[j][2]);
            }
         
    }
}   
