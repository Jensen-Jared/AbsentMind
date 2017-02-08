/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author melissajensen
 */
public class AntidoteControl {
    
    public double calcWeightInKilograms(double weight){
        
        if (weight <= 30){
            return -2;
        }
        if (weight >= 1000) {
            return -3;
        }
	
        //if (weight instanceof String){
        //    return -1;
        //}
	
        double weightKilo = weight * 0.45359237;
        
        return weightKilo;

        
    }
    
}
