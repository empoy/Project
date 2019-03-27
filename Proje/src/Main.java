import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner=new Scanner(System.in);
       
        File f = new File("student.txt");
        FileReader fr = new FileReader(f);
        FileWriter fw = new FileWriter(f,true);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(new FileWriter(f,true));
        
        System.out.println("If you want to enter new student hit 1");
        System.out.println("If you want to search a student hit 2");
        System.out.println("If you want to see all students hit 3");
        
       int sayi=scanner.nextInt();
      
        switch(sayi) {
        
    
        case 1:
        
        System.out.println("How many student will you add? ");
        int many=scanner.nextInt();
        scanner.nextLine();
        int x=0;
        
        while(x<many){
            System.out.println("Name:");
            String name=scanner.nextLine();
            System.out.println("Surname:");
            String surname=scanner.nextLine();
            System.out.println("ID:");
            String id=scanner.nextLine();
            System.out.println("GPA:");
            double gpa=scanner.nextDouble();
            scanner.nextLine();
            pw.println(name+" "+surname+" "+id+" "+gpa);
            x++;

        }  
        	pw.close();
        	break;
        	
        case 2:
       
        break;
        
        case 3:
        String text = ("");
        String line = br.readLine();
        while(line !=null) {
        	text+=line;
        	line = br.readLine();
        		}
        System.out.println(text);
        break;
        	} 
   		}	
    }
