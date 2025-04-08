import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    Passenger myPassenger;


    @BeforeEach
    void setup() {

       myPassenger = new Passenger();
    }

    @Test
    void TestTitle(){

    }

    @Test
    void TitleFail(){

        assertThrows(IllegalArgumentException.class, ()-> myPassenger.setTitle("Blah"));
    }

    @Test
    void FnameSuccess(){

    }

    @Test
    void FnameFail(){

        assertThrows(IllegalArgumentException.class, ()-> myPassenger.setFname("ja"));
    }


    @Test
    void LnameSuccess(){}

    @Test
    void LnameFail(){

        assertThrows(IllegalArgumentException.class, ()-> myPassenger.setLname("man"));
    }

    @Test
    void AgeSuccess(){}

    @Test
    void AgeFail(){
        assertThrows(IllegalArgumentException.class, ()-> myPassenger.setAge(15));
    }

    @Test
    void IdSuccess(){}

    @Test
    void IdFail(){

        assertThrows(IllegalArgumentException.class, ()-> myPassenger.setID("123"));
    }




}
