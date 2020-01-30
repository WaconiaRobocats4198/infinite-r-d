package frc.robot;
import edu.wpi.first.wpilibj.I2C;
//git test
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.util.Color;

import com.ctre.phoenix.motorcontrol.can.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANEncoder;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import com.revrobotics.ColorSensorV3;

public class Robot extends TimedRobot {
    
    I2C.Port i2Color = I2C.Port.kOnboard;

    CANSparkMax upper = new CANSparkMax(3, MotorType.kBrushless);
    CANSparkMax lower = new CANSparkMax(1, MotorType.kBrushless);

<<<<<<< HEAD
    // ColorSensorV3 scan = new ColorSensorV3(i2Color);

=======
>>>>>>> 553cef0c11acd40741e5d801b6d5556ae5dbf5d5
    // WPI_TalonSRX tipper = new WPI_TalonSRX(9);

    Joystick logi = new Joystick(1);

<<<<<<< HEAD
    
    // Color readColor = scan.getColor();
=======
    CANEncoder upperEnc = upper.getEncoder();
>>>>>>> 553cef0c11acd40741e5d801b6d5556ae5dbf5d5

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
<<<<<<< HEAD
    // System.out.println("FECK");
    // System.out.println(scan.getBlue());
    // System.out.println(logi.getRawAxis(2));
    
    
    // upper.set(-powerOut);
    // lower.set(-powerOut);
=======
    double powerOut = (-logi.getRawAxis(2) + 1)* 0.5;
    int powerRead = (int)(powerOut*100);

    System.out.println(powerRead);
    if(powerRead == 69){
      System.out.println("nice");
    }
      //oh hi there
    upper.set(-powerOut);
    lower.set(-powerOut);
    
    upper.set(-powerOut);
    lower.set(-powerOut);
>>>>>>> 553cef0c11acd40741e5d801b6d5556ae5dbf5d5

    // tipper.set(logi.getRawAxis(1));
    
  }

  @Override
  public void testPeriodic() {

  }
}
