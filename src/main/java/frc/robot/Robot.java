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
import com.revrobotics.CANPIDController;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.ControlType;

import com.revrobotics.ColorSensorV3;

public class Robot extends TimedRobot {
    
    // I2C.Port i2Color = I2C.Port.kOnboard;

    CANSparkMax upper = new CANSparkMax(3, MotorType.kBrushless);
    CANSparkMax lower = new CANSparkMax(1, MotorType.kBrushless);

    CANEncoder upperEnc = new CANEncoder(upper);
    CANEncoder lowerEnc = new CANEncoder(lower);

    CANPIDController uSpeedControl = new CANPIDController(upper);
    CANPIDController lSpeedControl = new CANPIDController(lower);

    // ColorSensorV3 scan = new ColorSensorV3(i2Color);

    // WPI_TalonSRX tipper = new WPI_TalonSRX(9);

    Joystick logi = new Joystick(1);

    limelight tracker = new limelight();

    double kP = 5e-5; 
    double kI = 5e-7;
    double kD = 0; 
    double kIz = 0; 
    double kFF = 0; 
    double kMaxOutput = 1; 
    double kMinOutput = -1;
    double maxRPM = 5700;

    // set PID coefficients
    
    // colorParse colorTest = new colorParse();

  @Override
  public void robotInit() {
    uSpeedControl.setP(kP);
    uSpeedControl.setI(kI);
    uSpeedControl.setD(kD);
    uSpeedControl.setIZone(kIz);
    uSpeedControl.setFF(kFF);
    uSpeedControl.setOutputRange(kMinOutput, kMaxOutput);

    lSpeedControl.setP(kP);
    lSpeedControl.setI(kI);
    lSpeedControl.setD(kD);
    lSpeedControl.setIZone(kIz);
    lSpeedControl.setFF(kFF);
    lSpeedControl.setOutputRange(kMinOutput, kMaxOutput);
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
    // double blue = scan.getBlue();
    // double red = scan.getRed();
    // double green = scan.getGreen();

    // double redBlue = red/blue;
    // double redGreen = red/green;
    // double blueGreen = blue/green;

    // System.out.println(redBlue + " redBlue");
    // System.out.println(redGreen + " redGreen");
    // System.out.println(blueGreen + " blueGreen");

    // System.out.println(colorTest.colorOutput(blue, green, red));
    

    // double powerOut = (-logi.getRawAxis(2) + 1)* 0.5;
    // int powerRead = (int)(powerOut*100);

    // System.out.println(powerRead);
    // if(powerRead == 69){
    //   System.out.println("nice");
    // }

    System.out.println(tracker.rangeFinder());
    

    // uSpeedControl.setReference(-powerOut * 4500, ControlType.kVelocity);
    // lSpeedControl.setReference(-powerOut * 5420, ControlType.kVelocity);

    // System.out.println(-lowerEnc.getVelocity() + " lower speed");
    // System.out.println(-upperEnc.getVelocity() + " upper speed");


    // tipper.set(logi.getRawAxis(1));
    
  }

  @Override
  public void testPeriodic() {

  }
}
