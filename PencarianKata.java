import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PencarianKata 
{
    public static void main(String [] args)
    {   
        System.out.println("======================================");     
        System.out.println("|| Program Pencarian Kata Pada File ||");     
        System.out.println("======================================");     

        Scanner scan = new Scanner(System.in);

        System.out.print("\nMasukkan Kata Yang Dicari : ");
        String cari = scan.next();        

        System.out.print("Nama File : ");        
        String inputFileName = scan.next();        
        System.out.println();

        try
        {
            File inputFile = new File(inputFileName);
            Scanner scanfile = new Scanner(inputFile);
            int counter = 0;

            while(scanfile.hasNext())
            {           
                String input = scanfile.next();
                
                if(input.equalsIgnoreCase(cari))
                {                    
                    counter++;
                    System.out.println(counter + ". " + input);                                        
                }                                           
            }
            if (counter == 0){                    
                System.out.println("Kata " + cari + " Tidak Ditemukan");
            }       
            else{
                System.out.println("\nKata " + cari + " Ditemukan Sebanyak : " + counter + " Kata");
            }                        

            scanfile.close();
            scan.close();
        }
        catch(Exception e)
        {
            System.out.print("==========================\n");     
            System.out.print("|| File Tidak Ditemukan ||\n");     
            System.out.print("==========================\n");             
        }
    }
}