package frc.robot;
//git test
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.can.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;;

public class Robot extends TimedRobot {
    CANSparkMax upper = new CANSparkMax(3, MotorType.kBrushless);
    CANSparkMax lower = new CANSparkMax(1, MotorType.kBrushless);

    WPI_TalonSRX tipper = new WPI_TalonSRX(9);

    Joystick logi = new Joystick(1);

  @Override
  public void robotInit() {
    

  }

 
  @Override
  public void robotPeriodic() {
  }

  
  @Override
  public void autonomousInit() {
   
  }

  
  @Override
  public void autonomousPeriodic() {
    
  }

  
  @Override
  public void teleopPeriodic() {
    double powerOut = (-logi.getRawAxis(2) + 1)* 0.5;
    int powerRead = (int)(100*powerOut);

    System.out.println(powerRead);

    upper.set(-powerOut);
    lower.set(-powerOut);

    tipper.set(logi.getRawAxis(1));
    
  }

  @Override
  public void testPeriodic() {
  }
}
