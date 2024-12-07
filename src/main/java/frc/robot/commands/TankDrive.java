package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

public class TankDrive extends Command {

    private DriveSubsystem driveSubsystem;

    private Joystick joy1 = new Joystick(0);


    public TankDrive(DriveSubsystem driveSubsystem) {
        this.driveSubsystem = driveSubsystem;

        addRequirements(this.driveSubsystem);
    }

    @Override
    public void initialize() {
      
    }

    @Override
    public void execute() {

        // poll joystick

        // convert joystick values to motor values

        // invoke driveSubsystem.setMotor
      
    }

}
