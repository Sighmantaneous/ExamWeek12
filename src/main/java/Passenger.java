public class Passenger{

   private String Title, Fname,Lname, ID ;
   private int Age ;

    public Passenger() {
        Title = "Mr";
        Fname = "Test";
        Lname = "Tester";
        ID = "100000";
        Age = 50;
    }

    public Passenger(String title, String fname, String lname, String ID, int age) {
        Title = title;
        Fname = fname;
        Lname = lname;
        this.ID = ID;
        Age = age;
    }

    public String getTitle() {
        return Title;
    }

    public char setTitle(String title) {
        Title = title;
        return 0;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}


