// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.SubsystemsInstance;

public class Intake_In extends CommandBase {
  private SubsystemsInstance inst;
  private RobotContainer m_robotContainer;
  
  /** Creates a new Intake_In. */
  public Intake_In() {
    // Use addRequirements() here to declare subsystem dependencies.
    inst = SubsystemsInstance.getInstance();
    addRequirements(inst.m_intake);

    m_robotContainer = RobotContainer.getInstance();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_robotContainer.GetRightBumperPressed(6)) {
      inst.m_intake.setIntakeMotor(-1.0);
    }
    if (m_robotContainer.GetRightBumperReleased(6)) {
      inst.m_intake.setIntakeMotor(0.0);
    }
    if (m_robotContainer.GetLeftBumperPressed(5)) {
      inst.m_intake.setIntakeMotor(1.0);
    }
    if (m_robotContainer.GetLeftBumperReleased(5)) {
      inst.m_intake.setIntakeMotor(0.0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
