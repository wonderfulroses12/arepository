package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class intakesubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void intakein(){
    	RobotMap.intakemotor.set(1);
    }
    public void intakeout(){
    	RobotMap.intakemotor.set(-1);
    }
    public void intakestop(){
    	RobotMap.intakemotor.set(0);
    }
}
