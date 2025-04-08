import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        String Title, Fname,Lname, ID ;
        int Age ;

        Passenger myPassenger = new Passenger();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Title");
        Title = sc.nextLine();
        if(Title == "Mr"){
            myPassenger.setTitle(Title);
        }
        if(Title == "Mrs"){
            myPassenger.setTitle(Title);
        }
        if(Title == "Ms"){
            myPassenger.setTitle(Title);
        }
        else
            throw new IllegalArgumentException("Title must be Mr, Mrs or Ms");

        System.out.println("Please enter First name ");
        Fname = sc.nextLine();
        if(Fname.length()<3){
            throw new IllegalArgumentException("Name must be at least 3 characters");
        }
        else
            myPassenger.setFname(Fname);


        System.out.println();





    }
}
