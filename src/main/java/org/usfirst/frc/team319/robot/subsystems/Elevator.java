/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team319.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.IPositionControlledSubsystem;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.models.MotionParameters;
import org.usfirst.frc.team319.models.SRXGains;
//import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.Elevator_Commands.JostickElevator;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Elevator extends Subsystem implements IPositionControlledSubsystem {

  private boolean isElevatorSolenoidExtended = true;

  private int homePosition = 0;

  // ----Hatch Positions----//

  private int hatchCollectPosition = 0;
  private int highHatchPosition = 0;
  private int middleHatchPosition = 0;
  private int lowHatchPosition = 0;

  // ----Cargo Positions----//
  private int cargoCollectPosition = 0;
  private int highCargoPosition = 0;
  private int middleCargoPosition = 0;
  private int lowCargoRocketPosition = 0;
  private int cargoShipCargoPosition = 0; // cargoShipCargoPosition should be around the same as middleHatchPosition

  // ----Travel Limits Positions----//

  private int topOfFirstStagePosition = 0;
  private int maxUpTravelPosition = 0;

  private double maxDownTravelPosition = homePosition;

  private int targetPosition = 0;

  // ----Gains, Pid Values, Talon Setup----//

  public final static int ELEVATOR_UP = 0;
  public final static int ELEVATOR_DOWN = 1;

  private final SRXGains elevatorUpGains = new SRXGains(ELEVATOR_UP, 0.0, 0.0, 0.0, 0.0, 0);
  private final SRXGains elevatorDownGains = new SRXGains(ELEVATOR_DOWN, 0.0, 0.0, 0.0, 0.0, 0);

  private MotionParameters UpMotionParameter = new MotionParameters(2600, 2000, elevatorUpGains);
  private MotionParameters DownMotionParameters = new MotionParameters(2600, 2000, elevatorDownGains);

  public LeaderBobTalonSRX elevatorLead = new LeaderBobTalonSRX(1, new BobTalonSRX(2), new BobTalonSRX(14), new BobTalonSRX(15));

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new JostickElevator());
  }

  public boolean isCarriageSafe(double targetElevatorPosition) {
    boolean atRisk = this.getCurrentPosition() < this.getSafePosition();
    if (atRisk && targetElevatorPosition < maxDownTravelPosition && getCurrentPosition() > topOfFirstStagePosition) {
      return false;
    } else {
      return true;
    }
  }
  public boolean isElevatorSolenoidExtended() {
    return isElevatorSolenoidExtended;
  }
  public void setIsElevatorSolenoidExtended(boolean isElevatorSolenoidExtended) {
    this.isElevatorSolenoidExtended = isElevatorSolenoidExtended;
  }
  public boolean isValidPosition(int position) {
    boolean withinBounds = position <= maxUpTravelPosition && position >= maxDownTravelPosition;
    return withinBounds;
  }

  // ----Get Misc Positions----//
  public double getHimePosition() {
    return this.homePosition;
  }

  public double getMaxDownTravelPosition() {
    return this.maxDownTravelPosition;
  }

  // ----Get Hatch Positions----//
  public double getHatchCollectPosition() {
    return this.hatchCollectPosition;
  }

  public double getHighHatchPosition() {
    return this.highHatchPosition;
  }

  public double getMiddleHatchPosition() {
    return this.middleHatchPosition;
  }

  public double getLowHatchPosition() {
    return this.lowHatchPosition;
  }

  // ----Get Cargo Positions----//
  public double getCargoCollectPosition() {
    return this.cargoCollectPosition;
  }

  public double getHighCargoPosition() {
    return this.highCargoPosition;
  }

  public double getMiddleCargoPosition() {
    return this.middleCargoPosition;
  }

  public double getLowCargoPosition() {
    return this.lowCargoRocketPosition;
  }

  public double getCargoShipPosition() {
    return this.cargoShipCargoPosition;
  }

  // ----Get Travel Limits----//

  public double getTopOfFirstStagePosition() {
    return this.topOfFirstStagePosition;
  }

  public double getMaxUpTravelPosition() {
    return this.maxUpTravelPosition;
  }

  public void manageMotion(double targetPosition) {
    double currentPosition = getCurrentPosition();
    if (currentPosition < targetPosition) {
      elevatorLead.selectMotionParameters(UpMotionParameter);
    } else {
      elevatorLead.selectMotionParameters(DownMotionParameters);

    }
  }

  public void motionMagicControl() {
    this.manageMotion(targetPosition);
    this.elevatorLead.set(ControlMode.MotionMagic, targetPosition, DemandType.ArbitraryFeedForward, 0.1);
  }

  public void incrementTargetPosition(int increment) {
    int currentTargetPostion = this.targetPosition;
    int newTargetPosition = currentTargetPostion + increment;
    if (isValidPosition(newTargetPosition)) {
      this.targetPosition = newTargetPosition;
    }
  }

  public double getSafePosition() {
    return 0;
  }

  @Override
  public boolean setTargetPosition(int targetPosition) {
    return false;
  }

  @Override
  public int getTargetPosition() {
    return 0;
  }

  @Override
  public int getCurrentPosition() {
    return 0;
  }

  @Override
  public double getCurrentVelocity() {
    double currentVelocity = this.elevatorLead.getSelectedSensorVelocity();
    return currentVelocity;
  }

  @Override
  public boolean isInPosition(int targetPosition) {
    int currentPosition = this.getCurrentPosition();
    int positionError = Math.abs(currentPosition - targetPosition);
    if (positionError < onTargetThreshold) {
      return true;
    } else {
      return false;
    }
  }
}
