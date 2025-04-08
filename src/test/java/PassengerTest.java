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

       String Title = myPassenger.setTitle();


    }

}
