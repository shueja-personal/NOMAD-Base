/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.util;

/**
 * Add your docs here.
 */
public final class MathUtils {

    public double avg(double arg1, double arg2){
        return (arg1 + arg2) / 2;
    }

    public double rad2deg(double radians){
        return lerp(radians, 2* Math.PI, 360);
    }
    

    public double deg2rad(double degrees){
        return lerp(degrees, 360, 2 * Math.PI);
    }
    /**
     * 
     * @param arg1 The number to convert
     * @param from A number in arg1's units
     * @param to The equivalent number in the target units
     * @return arg1 scaled to the target units
     */
    public double lerp(double arg1, double from, double to){
        double arg2 = arg1 * to / from;
        return arg2;
    }
}
