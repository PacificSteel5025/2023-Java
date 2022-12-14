// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private static XboxController driverController;
  private static RobotContainer instance;

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    driverController = new XboxController(Constants.DRIVER_CONTROLLER_PORT);
    configureButtonBindings();
  }

  public static RobotContainer getInstance() {
    if (instance == null) instance = new RobotContainer();

    return instance;
  }

  public double GetDriverRawAxis(int axis) {
    return driverController.getRawAxis(axis);
  }

  // Intake In
  public boolean GetRightBumperPressed(int rightBumper) {
    return driverController.getRawButtonPressed(rightBumper);
  }

  // Intake In
  public boolean GetRightBumperReleased(int rightBumper) {
    return driverController.getRawButtonReleased(rightBumper);
  }

  // Intake Out
  public boolean GetLeftBumperPressed(int leftBumper) {
    return driverController.getRawButtonPressed(leftBumper);
  }

  // Intake Out
  public boolean GetLeftBumperReleased(int leftBumper) {
    return driverController.getRawButtonReleased(leftBumper);
  }

  // Conveyor In
  public boolean GetAButtonPressed() { return false; }

  // Conveyor Out
  public boolean GetXButtonPressed() { return false; }

  // Shooter
  public boolean GetBButtonPressed() { return false; }


  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
