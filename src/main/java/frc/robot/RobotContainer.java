// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {

  TankDrive tankDrive;

  public RobotContainer() {
     configureBindings();
  }

  private void configureBindings() {
    tankDrive = new TankDrive(new DriveSubsystem());

    CommandScheduler.getInstance().registerComposedCommands(tankDrive);
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
