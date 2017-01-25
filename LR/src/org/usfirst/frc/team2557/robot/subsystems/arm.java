package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;
import org.usfirst.frc.team2557.robot.commands.armcommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class arm extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new armcommand());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void arm(){
    	RobotMap.leftactuator.set(-Robot.oi.joystick1.getRawAxis(3));
    	RobotMap.rightactuator.set(-Robot.oi.joystick1.getRawAxis(3));
    
    	
    }
}

