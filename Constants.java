// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // FIND THE VALUE OF MOTORS
    public static final int MOTOR_LEFT_1_ID = 1;
    public static final int MOTOR_LEFT_2_ID = 93;
    public static final int MOTOR_RIGHT_1_ID = 2;
    public static final int MOTOR_RIGHT_2_ID = 4;

    // FIND THE PORT OF THE CONTROLLER
    public static final int DRIVER_CONTROLLER_PORT = 2;

    // FIND THE Y AXIS FOR LEFT AND RIGHT STICK
    public static final int LEFT_STICK_Y = 1;
    public static final int RIGHT_STICK_Y = 5;

    // FIND THE X AXIS FOR LEFT STICK
    public static final int LEFT_STICK_X = 0;
    public static final int RIGHT_STICK_X = 4;

    // XBOX CONTROLLER TRIGGERS
    public static final int RIGHT_TRIGGER = 3;
    public static final int LEFT_TRIGGER = 2;
    
    // DRIVER TURNING RADIUS
    public static final double TURNING_RATE = 0.5;

    // FIND THE INTAKE MOTOR
    public static final int INTAKE_MOTOR_1_ID = 3;

    // FIND THE LEFT BUMPER
    public static final int LEFT_BUMPER = 5;

    // FIND THE RIGHT BUMPER
    public static final int RIGHT_BUMPER = 6;
    

}
