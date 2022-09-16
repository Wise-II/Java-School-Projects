
package methodchp4;

public class MethodCHP4 {

    // * @param args the command line arguments
    public static void main(String[] args) {    
        {
        int aNumber = 10;
        System.out.println
                ("in outer block, aNumber is " + aNumber );
        {
            int AnotherNumber = 512;
            System.out.print
                    ("In inner block, aNumber is " +
                            aNumber + " and another number is " +
                            AnotherNumber);
        }
        System.out.println("In outer block aNumber is " + aNumber);
        }
    }
    
}
