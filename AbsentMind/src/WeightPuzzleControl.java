/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author J.D. Jensen
 */
public class WeightPuzzleControl {
    
    public double calcSide1(double choice1, double choice2){
        int key1;
        int key2; 
        
        double choice1(){
        if (key1 = 1 || 2 || 3 || 4 || 6 || 7 || 8) {
             return 1;
        }     
        if (key1 = 5){
            return 2;
        }
        else{
            return 0;
        }
        }
    
    double choice2(){
        if (key2 = 1 || 2 || 3 || 4 || 6 || 7 || 8) {
             return 1;
        }     
        if (key2 = 5){
            return 2;
        }
        else{
            return 0;
        }
        }
    double side1 = choice1 + choice2;
    return side1;
    }
    
    public double calcSide2(double choice3, double choice4){
        int key3;
        int key4; 
        
        double choice3(){
        if (key3 = 1 || 2 || 3 || 4 || 6 || 7 || 8) {
             return 1;
        }     
        if (key3 = 5){
            return 2;
        }
        else{
            return 0;
        }
        }
    }
    double choice4(){
        if (key4 = 1 || 2 || 3 || 4 || 6 || 7 || 8) {
             return 1;
        }     
        if (key4 = 5){
            return 2;
        }
        else{
            return 0;
        }
        double side2 = choice3 + choice4;
        return side2;
        }
    
    public string calcWeight(side1, side2){
        if (side1 = side2){
            return "Both sides are equal.";
        }
        if (side1 > side2){
            return "Left scale is heavier."
        }
        else {
            return "Right scale is heavier."
        }
    }
    
    
}
