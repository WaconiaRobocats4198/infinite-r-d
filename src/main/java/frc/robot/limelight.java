
package frc.robot;

import com.revrobotics.*;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.shuffleboard.*;

public class limelight {
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    NetworkTableEntry tx = table.getEntry("tx");
    NetworkTableEntry ty = table.getEntry("ty");
    NetworkTableEntry tv = table.getEntry("tv");
    NetworkTableEntry ta = table.getEntry("ta");
    NetworkTableEntry ts = table.getEntry("ts");
    NetworkTableEntry tvert = table.getEntry("tvert");
    NetworkTableEntry tlong = table.getEntry("tlong");
    NetworkTableEntry tshort = table.getEntry("tshort");
    NetworkTableEntry ledMode = table.getEntry("ledMode");
    NetworkTableEntry camMode = table.getEntry("camMode");
    NetworkTableEntry stream = table.getEntry("stream");
    NetworkTableEntry pipeline = table.getEntry("pipeline");
    public double rangeFinder(){
        double heightFloor = 24;
        double llOffset = 6;
        double llAngle = 20;
        double targetHeight = 8.1875;
  
        double yOff = ty.getDouble(0.0);
        double xOff = tx.getDouble(0.0);
  
        double distance = (targetHeight-heightFloor)/Math.tan(yOff + llAngle);
        distance = distance - llOffset * Math.cos(90-Math.abs(xOff));
        
        return distance;
      }
}
