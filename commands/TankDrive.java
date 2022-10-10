// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.Utilities;
import frc.robot.subsystems.SubsystemsInstance;

public class TankDrive extends CommandBase {
  /** Creates a new TankDrive. */

  private SubsystemsInstance inst;
  private RobotContainer m_robotContainer;
  
  public TankDrive() {
    // Use addRequirements() here to declare subsystem dependencies.
    inst = SubsystemsInstance.getInstance();
    addRequirements(inst.m_driveTrain);

    m_robotContainer = RobotContainer.getInstance();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double triggerVal = m_robotContainer.GetDriverRawAxis(Constants.RIGHT_TRIGGER) - m_robotContainer.GetDriverRawAxis(Constants.LEFT_TRIGGER);
    double stick = Utilities.scale(m_robotContainer.GetDriverRawAxis(Constants.LEFT_STICK_X), Constants.TURNING_RATE);

    inst.m_driveTrain.setLeftMotors(triggerVal + stick);
    inst.m_driveTrain.setRightMotors(triggerVal - stick);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    inst.m_driveTrain.setLeftMotors(0);
    inst.m_driveTrain.setRightMotors(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
