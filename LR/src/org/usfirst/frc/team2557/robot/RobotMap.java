package org.usfirst.frc.team2557.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static CANTalon leftFront;
	public static CANTalon rightFront;
	public static CANTalon leftBack;
	public static CANTalon rightBack;
	public static RobotDrive drive;
	public static CANTalon leftactuator;
	public static CANTalon rightactuator;
	public static CANTalon intakemotor;
	public static Servo arm;
	
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;s
    // public static int rangefinderModule = 1;
	public static void init(){
		leftFront = new CANTalon(7);
		rightFront = new CANTalon(8);
		leftBack = new CANTalon(6);
		rightBack = new CANTalon(5);
		leftactuator = new CANTalon(2);
		rightactuator = new CANTalon(3);
		intakemotor = new CANTalon(4);
		leftFront.setInverted(true);
		rightFront.setInverted(true);
		leftBack.setInverted(true);
		rightBack.setInverted(true);
		drive = new RobotDrive(leftFront,leftBack,rightFront,rightBack);
		drive.setSafetyEnabled(false);
		
		arm = new Servo(4);
	}
}
