import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main (String[] args) throws IllegalArgumentException {

        String Title, Fname,Lname, ID ;
        int Age ;

        Passenger myPassenger = new Passenger();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Title");
        Title = sc.next();

        if(Title =="Mr"){
            myPassenger.setTitle(Title);
        }
        if(Title =="Mrs"){
            myPassenger.setTitle(Title);
        }
        if(Title =="Ms"){
            myPassenger.setTitle(Title);
        }
        else throw new IllegalArgumentException("Must be Mr, Mrs, or Ms");


        sc.nextLine();
        System.out.println("Please enter First name ");
        Fname = sc.next();
        if(Fname.length()<3){
            throw new IllegalArgumentException("Name must be at least 3 characters");
        }
        else
            myPassenger.setFname(Fname);

        sc.nextLine();
        System.out.println("Please enter last name");
        Lname = sc.next();

        if(Lname.length()<3){
            throw new IllegalArgumentException("Name must be at least 3 characters");
        }
        else{
            myPassenger.setLname(Lname);
        }
        sc.nextLine();
        System.out.println("Please enter the age");
        Age = sc.nextInt();

        if(Age <18){
            throw new IllegalArgumentException("Must be 18 and older");
        }
        else{
            myPassenger.setAge(Age);
        }
        sc.nextLine();
        System.out.println("Enter Id code");
        ID = sc.next();

        if(ID.length()<6){

            throw new IllegalArgumentException("ID code must be at least 6 characters");

        }
        else{
            myPassenger.setID(ID);
        }






    }
}
