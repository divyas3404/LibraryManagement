import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * LibraryManagemenr
 */
public class LibraryManagement {

    Scanner sc=new Scanner(System.in);
    int b_id,s_id,r_id;
    String b_name;

    /**
     *
     */
    HashMap<Integer,String> bookData=new HashMap<>();

    
    


    void show()
    {
        System.out.println("ID : " + bookData.keySet() + "\nName : "+ bookData.values());
        
    }
    

    void addBook()
    {
        System.out.println("Enter Book Id and Name: ");
        b_id=sc.nextInt();
        b_name=sc.next();

        //System.out.println("Enter Book Name: ");
        


        bookData.put(b_id, b_name);
    }

    void searchBook(){
        System.out.println("Enter Id: ");
        s_id=sc.nextInt();

        Boolean check=bookData.containsKey(s_id);

        if(check){
            System.out.println(bookData.get(s_id));
        }
        else{
            System.out.println("Enter correct ID****");
        }

    }

    void removeBook(){

        System.out.println("Enter Id: ");
        r_id=sc.nextInt();
        boolean k=bookData.containsKey(r_id);
        if(k)
        {bookData.remove(r_id);

        System.out.println("remove successfully");
        }
        else{
            System.out.println("enter correct ID");
        }

    }

}