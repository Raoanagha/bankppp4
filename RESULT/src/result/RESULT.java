
package result;
import java.util.Scanner;

public class RESULT 
{

   
    public static void main(String[] args) 
    {
       cal c=new cal();
       int z;
       for(;;)
       {
       System.out.println("ENTER YOUR CHOICE: ");
       System.out.println("\t 1.Enter students' records"+"\n"
               + "         2.Display students' records"+"\n"
               + "         3.Display the total marks scored by every student"+"\n"
               + "         4.Display the class topper "+"\n"
               + "         5.Display the topper of every subject"+"\n"
               + "         6.Display the passing percentage of the class"+"\n"
               + "         7.Display the passing percentage of every subject\n");
       Scanner in=new Scanner(System.in);
       z=in.nextInt();
       
    switch (z)
    {
        case 1:c.input();
               break;
        case 2:c.display();
               break;
        case 3:c.total();
               break;
        case 4: c.classtopper();
               break;
        case 5:c.mathtopper();
                c.mmctopper();
                c.dbmstopper();
                c.ostopper();
                c.daatopper(); 
               break;
        case 6:c.classpass();
               break;
        case 7:c.subjpass();
                break;
        default:System.out.println("INVALID OPTION");
                break;
    }
    }        
}    
}

    



    

