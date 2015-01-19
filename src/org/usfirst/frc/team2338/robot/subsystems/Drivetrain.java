package org.usfirst.frc.team2338.robot.subsystems;

import org.usfirst.frc.team2338.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;


/**
 *
 */
public class Drivetrain extends Subsystem {
    
    private CANTalon frontLeft = new CANTalon(RobotMap.frontLeft);
    private CANTalon frontRight = new CANTalon(RobotMap.frontRight);
    private CANTalon rearLeft = new CANTalon(RobotMap.rearLeft);
    private CANTalon rearRight = new CANTalon(RobotMap.rearRight);
    
    public void enableMotors(ControlMode controlMode) {
    	frontLeft.changeControlMode(controlMode);
    	frontRight.changeControlMode(controlMode);
    	rearLeft.changeControlMode(controlMode);
    	rearRight.changeControlMode(controlMode);
    	
    	frontLeft.enableControl();
    	frontRight.enableControl();
    	rearLeft.enableControl();
    	rearRight.enableControl();
    }
    
    //drives the robot
    public void drive(double leftSpeed, double rightSpeed) {
    	frontLeft.set(leftSpeed);
    	frontRight.set(-rightSpeed);
    	rearLeft.set(leftSpeed);
    	rearRight.set(-rightSpeed);
    }
    
    public void disableMotors() {
    	frontLeft.disableControl();
    	frontRight.disableControl();
    	rearLeft.disableControl();
    	rearRight.disableControl();
    }
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

