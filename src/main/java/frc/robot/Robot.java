package frc.robot;
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

import com.ctre.phoenix.motorcontrol.can.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANEncoder;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import com.revrobotics.ColorSensorV3;

public class Robot extends TimedRobot {
  
    
<<<<<<< HEAD
    I2C.Port i2Color = I2C.Port.kOnboard;

    //CANSparkMax upper = new CANSparkMax(3, MotorType.kBrushless);
    //CANSparkMax lower = new CANSparkMax(1, MotorType.kBrushless);

    ColorSensorV3 scan = new ColorSensorV3(i2Color);
    colorParse colorWheel = new colorParse();
    String lastColor = "oops";
    String currentColor = colorWheel.colorOutput(scan.getBlue(), scan.getGreen(), scan.getRed());
    int blue = 0;
    int green = 0;
    int red = 0;
    int yellow = 0;
=======
    // I2C.Port i2Color = I2C.Port.kOnboard;

    CANSparkMax upper = new CANSparkMax(3, MotorType.kBrushless);
    CANSparkMax lower = new CANSparkMax(1, MotorType.kBrushless);

    CANEncoder upperEnc = new CANEncoder(upper);
    CANEncoder lowerEnc = new CANEncoder(lower);

    CANPIDController uSpeedControl = new CANPIDController(upper);
    CANPIDController lSpeedControl = new CANPIDController(lower);

    


    // public static WPI_TalonSRX frontLeft = new WPI_TalonSRX(4);
    // public static WPI_TalonSRX frontRight = new WPI_TalonSRX(5);
    // public static WPI_TalonSRX backLeft = new WPI_TalonSRX(6);
    // public static WPI_TalonSRX backRight = new WPI_TalonSRX(7);

    // public static MecanumDrive scoot = new MecanumDrive(frontLeft, backLeft, frontRight, backRight);
>>>>>>> dd65b0b332be7b59042c9ff67df87edf8b2e3cf1

    //WPI_TalonSRX tipper = new WPI_TalonSRX(9);

    //Joystick logi = new Joystick(1);

<<<<<<< HEAD
    String lastTrue;

  @Override
  public void robotInit() {
    currentColor = colorWheel.colorOutput(scan.getBlue(), scan.getGreen(), scan.getRed());
    lastTrue = currentColor;
=======
    Joystick logi = new Joystick(1);

    limelight tracker = new limelight();

    double kP = 1e-4; 
    double kI = 3e-7;
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

    lower.setOpenLoopRampRate(0.3);
    lower.setClosedLoopRampRate(0.3);
>>>>>>> dd65b0b332be7b59042c9ff67df87edf8b2e3cf1
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
    //System.out.println("FECK");
    //System.out.println(scan.getBlue());
    
    //System.out.println(scan.getGreen());
    System.out.println(colorWheel.colorOutput(scan.getBlue(), scan.getGreen(), scan.getRed()));

<<<<<<< HEAD
    //double powerOut = (-logi.getRawAxi````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````s(2) + 1)* 0.5;
    //int powerRead = (int)(powerOut*100);
=======
    double powerOut = (-logi.getRawAxis(2) + 1) * 0.5;
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
    lower.setOpenLoopRampRate(0.3);
    // uSpeedControl.setReference(-powerOut * 11000, ControlType.kVelocity);
    if(logi.getRawButton(1)){
      lower.set(0.3);;
    }
    else{
      lower.set(0);;
    }
    // lower.set(powerOut);
    System.out.println(-lowerEnc.getVelocity() + " lower speed");
    // System.out.println(-upperEnc.getVelocity() + " upper speed");
>>>>>>> dd65b0b332be7b59042c9ff67df87edf8b2e3cf1

    //System.out.println(powerRead);
    //if(powerRead == 69){
      //System.out.println("nice");
    //}
      //oh hi there
    //upper.set(-powerOut);
    //lower.set(-powerOut);

    // tipper.set(logi.getRawAxis(1));
    
    currentColor = colorWheel.colorOutput(scan.getBlue(), scan.getGreen(), scan.getRed());
    if(lastColor != currentColor){
      if(currentColor == "B" && lastTrue ==  "G"){
        blue++;
        lastTrue = currentColor;
      }
      else if(currentColor == "G" && lastTrue == "R"){
        green++;
        lastTrue = currentColor;
      }
      else if(currentColor == "R" && lastTrue == "Y"){
        red++;
        lastTrue = currentColor;
      }
      else if(currentColor == "Y" && lastTrue == "B"){
        yellow++;
        lastTrue = currentColor;
      }
    }
    lastColor = currentColor;
    System.out.println("blue: "+ blue + " green: "+ green + " red: "+ red + " yellow: "+ yellow);
    
  }

  @Override
  public void testPeriodic() {

  }
}
