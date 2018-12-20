import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PencarianKata1
{
    public static void main(String [] args)
    {   
        System.out.println("======================================");     
        System.out.println("|| Program Pencarian Kata Pada File ||");     
        System.out.println("======================================");       

        Scanner scan = new Scanner(System.in);        

        System.out.print("\nMasukkan kata yang dicari : ");
        String cari = scan.next();        
        
        System.out.print("Masukkan jumlah file : ");
        int n = scan.nextInt();        

        if(n == 1)
        {
            System.out.print("Nama file : ");        
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
                    System.out.println("Kata " + cari + " tidak ditemukan");
                }       
                else{
                    System.out.println("\nKata " + cari + " ditemukan sebanyak : " + counter + " kata");
                }                        

                scanfile.close();
                scan.close();
            }
            catch(Exception e)
            {                
                System.out.println("==========================");     
                System.out.println("|| File tidak ditemukan ||");     
                System.out.println("==========================");                         
            }
        }
        else if (1 < n)
        {         
            for(int i = 1; i < (n + 1); i++)
            {                
                System.out.print("Nama file " + i + " : ");        
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
                        System.out.println("Kata " + cari + " tidak ditemukan\n");
                    }       
                    else{
                        System.out.println("\nKata " + cari + " ditemukan sebanyak : " + counter + " kata\n");
                    }                        

                    scanfile.close();
                    // scan.close();
                    // inputFileName = scan();
                }
                catch(Exception e)
                {
                    System.out.println("==========================");     
                    System.out.println("|| File tidak ditemukan ||");     
                    System.out.println("==========================");        
                    System.out.println();     
                }                
            }                        
        }
        else
        {
            System.out.println();
            System.out.println("===========================================");     
            System.out.println("|| Jumlah file tidak boleh kurang dari 0 ||");     
            System.out.println("==========================================="); 
        }
    }
}