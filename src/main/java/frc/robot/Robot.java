package frc.robot;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.AnalogInput;

import edu.wpi.first.wpilibj.I2C;
//git test
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.util.Color;

import edu.wpi.first.networktables.*;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.shuffleboard.*;

import com.ctre.phoenix.motorcontrol.can.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.ControlType;


import com.revrobotics.ColorSensorV3;

public class Robot extends TimedRobot {
    int frontLeft = 1;
    int frontRight = 2;
    int backLeft = 12;
    int backRight = 11;


    
    // I2C.Port i2Color = I2C.Port.kOnboard;

    CANSparkMax inUse = new CANSparkMax(5, MotorType.kBrushless);
    CANSparkMax toplauncher = new CANSparkMax(6, MotorType.kBrushless);
    CANSparkMax botLauncher = new CANSparkMax(7, MotorType.kBrushless);
    // CANSparkMax lower = new CANSparkMax(1, MotorType.kBrushless);

    CANEncoder upperEnc = new CANEncoder(inUse);
    // CANEncoder lowerEnc = new CANEncoder(lower);

    CANPIDController uSpeedControl = new CANPIDController(inUse);
    // CANPIDController lSpeedControl = new CANPIDController(lower);

    DigitalInput testSwitch = new DigitalInput(0);

    // public NetworkTableEntry maxSpeed =
    //       tab.add("Auto", 1)
    //       .getEntry();

    // public static WPI_TalonSRX frontLeft = new WPI_TalonSRX(4);
    // public static WPI_TalonSRX frontRight = new WPI_TalonSRX(5);
    // public static WPI_TalonSRX backLeft = new WPI_TalonSRX(6);
    // public static WPI_TalonSRX backRight = new WPI_TalonSRX(7);

    // public static MecanumDrive scoot = new MecanumDrive(frontLeft, backLeft, frontRight, backRight);

    // ColorSensorV3 scan = new ColorSensorV3(i2Color);

    // WPI_TalonSRX tipper = new WPI_TalonSRX(9);

    Joystick logi = new Joystick(1);

    limelight tracker = new limelight();

    // public static DigitalInput inSensor = new DigitalInput(0);
    // public static DigitalInput outSensor = new DigitalInput(1);

    double kP = 1e-4; 
    double kI = 3e-7;
    double kD = 0; 
    double kIz = 0; 
    double kFF = 0; 
    double kMaxOutput = 1; 
    double kMinOutput = -1;
    double maxRPM = 5700;

    double pAdjust = -4;

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

    // lSpeedControl.setP(kP);
    // lSpeedControl.setI(kI);
    // lSpeedControl.setD(kD);
    // lSpeedControl.setIZone(kIz);
    // lSpeedControl.setFF(kFF);
    // lSpeedControl.setOutputRange(kMinOutput, kMaxOutput);
    


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
    System.out.println(testSwitch.get());
   
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
    // System.out.println(logi.getRawAxis(1));

    // double powerOut = (-logi.getRawAxis(2) + 1) * 0.5;
    // int multiply;
    // if(logi.getRawButton(6)){
    //   multiply = 1; 
    // }
    // else if(logi.getRawButton(7)){
    //   multiply = -1;
    // }
    // else{
    //   multiply = 0;
    // }
    // inUse.set(powerOut * multiply);

    // if(logi.getRawButton(1)){
    //   toplauncher.set(-0.2);
    //   botLauncher.set(-0.2);
    // }
    // else{
    //   toplauncher.set(0);
    //   botLauncher.set(0);
    // }

    // int powerRead = (int)(powerOut*100);

    // System.out.println(powerRead);
    // if(powerRead == 69){
    //   System.out.println("nice");
    // }

    // System.out.println(tracker.rangeFinder() + " distance");
    // System.out.println(tracker.offsetCalculator());
    // if(tracker.xOff < tracker.offsetCalculator() -1){
    //   scoot.driveCartesian(0, 0, -0.1);
    // }
    // else if(tracker.xOff > tracker.offsetCalculator() + 1){
    //   scoot.driveCartesian(0, 0, 0.15);
    // }

    // uSpeedControl.setReference(-5400, ControlType.kVelocity);
    // if(logi.getRawButton(1)){
    //   upper.set(0.3);

    // }
    // else{
    //   upper.set(0);
    // }

    // System.out.println(outSensor.get());

    
    // if(logi.getRawButtonReleased(3)){
    //   pAdjust++;
    // }
    // if(logi.getRawButtonReleased(2)){
    //   pAdjust--;
    // }
    
    // kP = 1 * Math.pow(10, pAdjust);
    // lSpeedControl.setP(kP);
    
    // if(logi.getRawButton(1)){
    //   lSpeedControl.setReference(400 * (double)((int)(logi.getRawAxis(2))), ControlType.kVelocity);
    // }
    // else{
    //   lower.set(0);
    // }
    // lower.set(powerOut);
    // System.out.println(-lowerEnc.getVelocity() + " lower speed");
    // System.out.println(-upperEnc.getVelocity() + " upper speed");


    // tipper.set(logi.getRawAxis(1));
    
  }

  @Override
  public void testPeriodic() {

  }
}
