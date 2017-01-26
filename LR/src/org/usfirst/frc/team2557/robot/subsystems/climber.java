package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class climber extends Subsystem {
	
	boolean ArmUp = false;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void climberarm(){
    	if(ArmUp == false && RobotMap.arm.get() == 0){
    	RobotMap.arm.set(1);
    	ArmUp = true;
    	}
    	RobotMap.arm.set(0);
    }
    
}

