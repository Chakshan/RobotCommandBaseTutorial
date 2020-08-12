/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {


    //PWM's
	public static final int RIGHT_BACK = 0;
	public static final int LEFT_BACK = 1;
	public static final int RIGHT_FRONT = 2;
	public static final int LEFT_FRONT = 3;

	public static final int SHOOTER = 4;

	public static final int INTAKE = 5;


	public static final int JOYSTICK_NUMBER = 0;
	public static final int XBOX_LEFT_Y_AXIS = 1;
	public static final int XBOX_LEFT_X_AXIS = 0;
	public static final int RIGHT_TRIGGER = 0;


	public static final double DRIVE_TRAIN_SPEED = 0.7;
	public static final double DRIVE_FORWARD_TIME = 3.0;
	public static final double AUTONOMOUS_SPEED = 0.4;
	

	public static final double SHOOTER_SPEED = 0.5;
	public static final double INTAKE_SPEED = 0.7;


	public static final int CAMERA_RES_X = 320;
	public static final int CAMERA_RES_Y= 240;
	public static final double AUTO_SHOOT_TIME = 2.0;

	// Analog Inputs
	public static final int RANGE_FINDER = 0;


	public static final double SETPOINT_FORWARD = 1.5;
	
	
	
	
}
