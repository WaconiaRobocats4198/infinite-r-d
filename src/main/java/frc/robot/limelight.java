
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
        double heightFloor = 21.35;
        double llOffset = 0;
        double llAngle = 18.5;
        double targetHeight = 66.25;

        int target = (int)tv.getDouble(0.0);
  
        double yOff = ty.getDouble(0.0);

        // System.out.println(yOff + " YOFF");
        double xOff = tx.getDouble(0.0);
        System.out.println(xOff);

        double distance = -0.0;
        if (target != 0){
          // System.out.println("TARGET ACQUIRED");
          distance = (targetHeight-heightFloor)/Math.tan((yOff + llAngle) * ((2 * Math.PI)/360));
          distance = distance - llOffset * Math.cos((90-Math.abs(xOff)) * ((2 * Math.PI)/360));
        }

        // System.out.println(Math.tan((yOff + llAngle) * ((2 * Math.PI)/360)));
        // System.out.println(distance + " in Method distance");

        return distance;
      }
}
