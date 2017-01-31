package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SmartDash extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void voltage(){
    	SmartDashboard.putNumber("Front Left Motor Volage is ", RobotMap.leftFront.getOutputVoltage());
    	SmartDashboard.putNumber("Back Left Motor Voltage is ", RobotMap.leftBack.getOutputVoltage());
    	SmartDashboard.putNumber("Front Right Motor Voltage is" , RobotMap.rightFront.getOutputVoltage());
    	SmartDashboard.putBoolean("arm up", Robot.climber.ArmUp);
    	SmartDashboard.putNumber("the angle is", RobotMap.arm.getAngle());
    }
}

