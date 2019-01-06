import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PencarianKataArgument
{
    public static void main(String args[])
    {   
        Scanner scan = new Scanner(System.in);        

        System.out.print("Kata yang dicari : " + args[0] + "\n\n");                

        if (1 < args.length)
        {         
            for(int i = 1; i < args.length; i++)
            {                    
                String inputFileName = args[i];

                try
                {
                    File inputFile = new File(inputFileName);
                    Scanner scanfile = new Scanner(inputFile);
                    int counter = 0;

                    while(scanfile.hasNext())
                    {           
                        String input = scanfile.next();
                        
                        if(input.equalsIgnoreCase(args[0])){                    
                            counter++;                                       
                        }                                           
                    }
                    if (counter == 0){                    
                        System.out.println("Kata " + args[0] + " pada file " + args[i] + " tidak ada");
                    }       
                    else{
                        System.out.println("Kata " + args[0] + " pada file " + args[i] + " ada " + counter);
                    }                        
                    scanfile.close();
                    scan.close();
                }
                catch(Exception e)
                { 
                    System.out.println("File " + args[i] + " tidak ada");    
                }                
            }                        
        }
        else
        {
            System.out.println("===========================");     
            System.out.println("|| File Tidak Dimasukkan ||");     
            System.out.println("==========================="); 
        }
    }
}