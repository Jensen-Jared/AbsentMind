/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absentmind;

/**
 *
 * @author Josh
 */
public class AbsentMind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        
        playerOne.setName("John Doe");
        playerOne.setBestTime(7.00);
        playerOne.setEndingType("You died.");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
