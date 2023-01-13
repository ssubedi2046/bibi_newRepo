import java.io.IOException;
import java.util.Scanner;

import com.google.gson.JsonIOException;

public class LibraryManagementSystem {

	public static void main(String[] args) throws JsonIOException, IOException {
		// TODO Auto-generated method stub
		
	    	Library l1 =new Library();
	    Scanner sc = new Scanner(System.in);
	   
	    System.out.println("Welcome to the library.");

	// loop runs Infinitly until user wishes to exit
	 while(true){
	    // clear();
	 System.out.println("\n Enter your action \n 1.Add Book \n 2.Log in \n 3.Add Student \n\n Any other key to Exit...");
	 System.out.println("\n");
	 System.out.println("Enter your choice here...");
	 
	 int choice ;
	 
	 // input mismatch exception handling

	try{
	  choice = sc.nextInt();
	}catch(Exception e){
	    /*System.out.println("Please enter integer value.");
	    System.out.println("Press any key to exit..");
	    String exit = sc.nextLine();
	    exit = sc.nextLine();
	    */ choice = 4;
	}

	//decision making 
	if ( choice == 1){
	         
	    String bookName = sc.nextLine();         // eats the \n line 
	    System.out.println("Enter name of book: ");
	     bookName = sc.nextLine();
	    

	    System.out.println("Enter name of Author: ");
	    String authorName = sc.nextLine();   
	    l1.addBook(bookName , authorName);
		System.out.println("\nPress any key to return .");
	    String returning = sc.nextLine(); 
	      
	}
	else if (choice == 2){
	    int id, pass;
	            System.out.println("Enter log in ID:");
	            id = sc.nextInt();
	            
	             System.out.println("Enter log in Password:");
	            pass = sc.nextInt();
	        
	            int flag = 1;//l1.login(id,pass);
	            if (flag == 1){
	                
	             First:
	                while(true){
	                    
	                //user defined function to clear screen    
	                clear();
	                
	                
	                System.out.println("MENU \n 1.Available Books \n 2.Issue Book \n 3.Return Book \n 4.Issued Books \n 5.Log out");
	               
	               int choicee;
	               
	                // input mismatch exception handling

	                try{
	                  choicee = sc.nextInt();
	                }catch(Exception e){
	                  System.out.println("Please enter integer value.");
	                  System.out.println("Press any key to log out..");
	                  String exit = sc.nextLine();
	                  exit = sc.nextLine();
	                  choicee = 5;
	                }  
	               
	               
	               
	               
	                switch( choicee )
	                 {
	 
	                    case 1:
	                   {
	                      try {
							l1.showAvailableBooks();
						} catch (JsonIOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	    
	                      System.out.println("\nPress any key to return .");
	                      String returning = sc.nextLine();
	                      returning = sc.nextLine();
	                      break;
	                    }
	                   case 2:
	                    {
	                      String bookName;
	                       String authorName;
	  
	                      bookName = sc.nextLine();
	                       System.out.println("Enter name of book: ");
	                      bookName = sc.nextLine();
	                      System.out.println("Enter name of Author: ");
	                      authorName = sc.nextLine();
	    
	                      l1.issueBook( bookName, authorName);
	    
	                      System.out.println("\nPress any key to return .");
	                      String returning = sc.nextLine();
	    
	                        break;
	                    }
	                    case 3:
	                    {
	                      String bookName;
	                      String authorName;
	  
	                      bookName = sc.nextLine();
	                      System.out.println("Enter name of book: ");
	                      bookName = sc.nextLine();
	    
	                      System.out.println("Enter name of Author: ");
	                      authorName = sc.nextLine();
	    
	                      l1.returnBook(bookName , authorName);
	  
	                      System.out.println("\nPress any key to return .");
	                      String returning = sc.nextLine();
	  
	                        break;
	                    }
	                    case 4:
	                    {
	                      l1.showIssuedBooks();
	    
	                      System.out.println("\nPress any key to return .");
	                      String returning = sc.nextLine();
	                      returning = sc.nextLine();
	    
	                      break;
	                    }
	                    case 5:
	                    {
	            
	                        break First;
	            
	                    }
	 
	                    default:
	                    {
	                      System.out.println(" Invalid choice. ");
	    
	                      System.out.println("Press any key to return .");
	                      String returning = sc.nextLine();
	    
	                    }
	                }
	                
	            }
	                
	            }
	            else{
	             System.out.println("Log in unsucessfull");
	             System.out.println("\nPress any key to return .");
	             String returning = sc.nextLine();
	            }
	            
	                
	            
	            }

	            else if (choice == 3)
	            {
	             int id, pass;
	             System.out.println("Enter student ID:");
	             id = sc.nextInt();
	              
	             System.out.println("Enter Password:");
	             pass = sc.nextInt();
	             
	             l1.addStu(id,pass);
	             
	             String returning = sc.nextLine();
	             System.out.println("\nPress any key to return .");
	              returning = sc.nextLine();
	            }
	            else
	              {
	                   System.out.println(" Thank you!!");
	                   System.exit(0); 
	              }


	        }
	    }


	//function to clear screen
	public static void clear()
	    {
		System.out.print("\033[H\033[2J");
	      System.out.flush();
	    }

	

}