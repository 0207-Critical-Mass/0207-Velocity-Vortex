package org.firstinspires.ftc.teamcode;

/**
 * Created by aburur on 10/14/16.
 */

public class helperFunctions {
    public static double buttonToPower (boolean isDown) {
        //turns input from buttons (double between 0 and 1) to a flat double (1.0)
        if (isDown) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
    public static double distanceToRevs (double distance) {
        //MAKE SURE DISTANCE IS GIVEN IN CENTIMETERS
        double wheelSize = 10;  //TODO: This should be changed to the circumference of the wheel, 10 is currently just a filler
        return (distance / wheelSize);
    }
    public static double triggerToFlat (double input)
    {
        //turns inputs of less than 1 into inputs of one, as long as they are greater than 0
        if (input > 0) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}