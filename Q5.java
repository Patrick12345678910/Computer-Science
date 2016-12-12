import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class Main {
    public static void SearchTerm() throws IOException {
        Scanner input = new Scanner(System.in);
        system.out.println("Please enter a definition to search for")
        string searchWord = input.nextLine();
        FileReader fr = new FileReader("C:\\Users\\Patch\\CSHWK\\keyterms.txt");
        BufferedReader br = new BufferedReader(fr);
        String layer;
        boolean found = false;
        
        while((layer = br.readLine()) ! = null) {
            if (searchWord.equals(layer)) {
                System.out.println(layer);
                layer = br.readLine();
                System.out.println(layer);
                found = true;
                break;
            }
            
        }
        if (found == false) {
            System.out.println("The Definition is not found")
        }
    }
     {  
        static void searchContent() throws IOException;
        Scanner input = new Scanner(System.in);
        String searchContent = input.nextLine();
        FileReader fr = new FileREader("C:\\Users\\Patch\\CSHWK\\keyterms.txt");
        BufferedReader br = new BufferedReader(fr);
        String layer1;
        String layer2;
        booleand found = false;
        
        while((layer1 = br.readLine()) != null) {
           layer2 = br.readLine();
           if (layer2.contains(searchContent)) {
               System.out.println(layer1);
               System.out.println(layer2);
               found = true;
           }
       }
       if (found == false) {
           System.out.println("Content not found");
       }
   }
    {
       Scanner input = new Scanner(System.in);
       System.out.println("1. Look for a keyterm 2. Search for a keyword from the content in the description 3.If you want to close the program enter any other number" );
       int numberChoice = input.nextInt() ;
       System.out.println(choice);
       if(choice == 1) {
           searchTerm();
       }
       else if(choice == 2) {
           searchContent();
       }
       else {
           System.out.println("Exiting...");
           System.exit;
       }
    } 
}
