/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsamdmich;

/**
 *
 * @author 0404489
 */
public class SandwichFilling{ 
         String filling;
           int calories;
    SandwichFilling(String fill, int cal)
    {
        filling = fill;
        calories = cal;
    }    
    public String GetSandwichfilling(){
        
                return filling;
                        
        
           }            
    public int GetCalories()
    {
                return calories;

                

    } 
}