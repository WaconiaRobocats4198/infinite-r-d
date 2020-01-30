package frc.robot;
//git test
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.can.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANEncoder;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;;

public class Robot extends TimedRobot {
    CANSparkMax upper = new CANSparkMax(3, MotorType.kBrushless);
    CANSparkMax lower = new CANSparkMax(1, MotorType.kBrushless);

    // WPI_TalonSRX tipper = new WPI_TalonSRX(9);

    Joystick logi = new Joystick(1);

    CANEncoder upperEnc = upper.getEncoder();

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
<<<<<<< HEAD
    int powerRead = (int)(powerOut*100);

    System.out.println(powerRead);
    if(powerRead == 69){
      System.out.println("nice");
    }

    upper.set(-powerOut);
    lower.set(-powerOut);
    
    int powerRead = (int)(100*powerOut);

    System.out.println(powerRead);

    upper.set(-powerOut);
    lower.set(-powerOut);
>>>>>>> 37fc2b87b8918ed8ec48c8ab5095a152fd9409ce

    // tipper.set(logi.getRawAxis(1));
    
  }

  @Override
  public void testPeriodic() {
  }
}
