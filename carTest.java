import com.example.cars.Car;
import com.example.cars.Direction;
import com.example.cars.Saab95;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    Car saabTest = new Saab95(2, 125, Color.red, "Saab95", Direction.West);

    @Test
    void Current_direction_should_be_West(){

        assertEquals(Direction.West, saabTest.getCurrentDirection());
    }

    @Test
    void turn_left_should_give_South(){
        saabTest.turnLeft();
        assertEquals(Direction.South, saabTest.getCurrentDirection());
    }

}
