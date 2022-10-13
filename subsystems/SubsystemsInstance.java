// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SubsystemsInstance extends SubsystemBase {
  public DriveTrain m_driveTrain;
  public Intake m_intake;

  private static SubsystemsInstance inst;
  
  /** Creates a new SubsystemsInstance. */
  private SubsystemsInstance() {
    m_driveTrain = new DriveTrain();
    m_intake = new Intake();

    CommandScheduler.getInstance().registerSubsystem(m_driveTrain);
    CommandScheduler.getInstance().registerSubsystem(m_intake);
  }

  public static SubsystemsInstance getInstance() {
    if (inst == null) inst = new SubsystemsInstance();

    return inst;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
