/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team319.robot.commands.BBArm_Commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import org.usfirst.frc.team319.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ManualCollect extends Command {

	private boolean joystickControl = true;
	private double targetSpeed = 0.0;

	public ManualCollect() {
		requires(Robot.bbarm);
		joystickControl = true;
	}

	public ManualCollect(double speed) {
		requires(Robot.bbarm);
		joystickControl = false;
		targetSpeed = speed;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		//System.out.println("Cube collector is spitting");
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (joystickControl) {
			double spitPower = Robot.oi.driverController.triggers.getLeft();
			targetSpeed = (spitPower * spitPower);
			Robot.bbarm.collectorTalon.set(ControlMode.PercentOutput, targetSpeed);
		} else {
			Robot.bbarm.collectorTalon.set(ControlMode.PercentOutput, targetSpeed);
		}

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.bbarm.collectorTalon.set(ControlMode.PercentOutput, 0);

	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Robot.bbarm.collectorTalon.set(ControlMode.PercentOutput, 0);
	}
}
