package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {

    private MotorController leftMotor1 = new CANSparkMax(Constants.LEFT_MOTOR_1, CANSparkLowLevel.MotorType.kBrushed);
    private MotorController leftMotor2 = new CANSparkMax(Constants.LEFT_MOTOR_2, CANSparkLowLevel.MotorType.kBrushed);
    private MotorController rightMotor1 = new CANSparkMax(Constants.RIGHT_MOTOR_1, CANSparkLowLevel.MotorType.kBrushed);
    private MotorController rightMotor2 = new CANSparkMax(Constants.RIGHT_MOTOR_2, CANSparkLowLevel.MotorType.kBrushed);

    public void setMotors(double left, double right) {
        left = scaleLeft(left);
        right = scaleRight(right);

        setMotorsRaw(left, right);
    }

    private void setMotorsRaw(double left, double right) {
        left = safetyTest(left);
        right = safetyTest(right);

        leftMotor1.set(left);
        leftMotor2.set(left);
        rightMotor1.set(right);
        rightMotor2.set(right);
    }

    private double safetyTest(double motorValue) {
        motorValue = (motorValue < -1) ? -1 : motorValue;
        motorValue = (motorValue > 1) ? 1 : motorValue;

        return motorValue;
    }

    private double scaleLeft(double left) {
        return 1.0 * left;
    }

    private double scaleRight(double right) {
        return 1.0 * right;
    }
}
