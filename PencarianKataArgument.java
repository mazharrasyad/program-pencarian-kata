import java.util.Scanner;
import java.io.File;

public class PencarianKataArgument
{
    public static void main(String args[])
    {                   
        if(args.length == 0)
        {
            System.out.println("========================");     
            System.out.println("|| Argument Tidak Ada ||");     
            System.out.println("========================"); 
        }
        else if (args.length == 1)
        {
            System.out.println("====================");     
            System.out.println("|| File Tidak Ada ||");     
            System.out.println("===================="); 
        }
        else
        {       
            System.out.println("Kata yang dicari : " + args[0]);                
            System.out.println();                            

            for(int i = 1; i < args.length; i++)
            {                    
                try
                {                                
                    if(args[i].substring(args[i].length() - 4).equals(".txt")){                                                                
                        File namafile = new File(args[i]);
                        Scanner scanfile = new Scanner(namafile);
                        int jumlah = 0;
                        
                        while(scanfile.hasNext())
                        {           
                            String kata = scanfile.next();
                            
                            if(kata.equalsIgnoreCase(args[0])){                    
                                jumlah++;                                       
                            }                                           
                        }
                        scanfile.close();

                        if (jumlah == 0){                    
                            System.out.println("Pada file " + args[i] + " tidak ada");
                        }       
                        else{
                            System.out.println("Pada file " + args[i] + " ada " + jumlah);
                        }   
                    }                   
                    else{
                        System.out.println("File " + args[i] + " tidak berekstensi .txt");                        
                    }       
                }
                catch(Exception e)
                { 
                    System.out.println("File " + args[i] + " tidak ada");    
                }                
            }                        
        }        
    }
}