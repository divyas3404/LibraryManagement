import java.util.Scanner;

/**
 * LibraryMain
 */
public class LibraryMain {

    public static void main(String[] args) {
        
        int ch;

        Scanner sc=new Scanner(System.in);

        LibraryManagemenr lm=new LibraryManagemenr();

        do{
        System.out.println("\n1.ADD Book\n2.Show book\n3.Search Book\n4.Remove Book\n5.Exit\nEnter your choice:-");
        ch=sc.nextInt();

        switch (ch) {
            case 1:
                lm.addBook();
                break;
            
            case 2:
                lm.show();
                break;

            case 3:
                lm.searchBook();
                break;
            
            case 4:
                lm.removeBook();
                break;

            default:
                break;
        }

    }while(ch!=5);

    }
}