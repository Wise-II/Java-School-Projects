/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodchp4;

/**
 *
 * @author Wise-XXIV
 */
public class OverridingVariable 
{
   public static void main(String[] args)
   {        
    int aNumber = 10;
    System.out.println("In main(), aNumber is " + aNumber);
   firstMethod();
    System.out.println("Back in main(), aNumber is " + aNumber);
   secondmethod(aNumber);
    System.out.println("Back in main() again, aNumber is " + aNumber);
   }
   
public static void firstMethod()
{
  int aNumber = 77;
    System.out.println("In firstMethod(), aNumber is "
+ aNumber);
}
 // this time around its passing a local memory adress (variable)
public static void secondmethod(int aNumber)
{
        System.out.println("In secondMethod(), at first " +
"aNumber is " + aNumber);
aNumber = 862;
System.out.println("In secondMethod(), after an assignment " +
"aNumber is " + aNumber);

    

}
}