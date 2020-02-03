package frc.robot;

public class colorParse{
    String colorOutput(double cBlue, double cGreen, double cRed){
        // double redBlue = cRed/cBlue;
        // double redGreen = cRed/cGreen;
        // double blueGreen = cBlue/cGreen; 

        double blueRed = cBlue/cRed;
        // double greenRed = cGreen/cRed;
        // double greenBlue = cGreen/cBlue;

        // System.out.println(blueRed + " blueRed");
        // System.out.println(greenRed + " greenRed");
        // System.out.println(greenBlue + " greenBlue");
        if(cGreen > cRed && blueRed > 1.8){
            // System.out.println("BLUE");
            return "B";
        }
        else if(cGreen > cBlue && cGreen > cRed){
            if(cRed > cBlue){
                return "Y";
            }
            else{
                return "G";
            }
        }
<<<<<<< HEAD
        else if(redBlue > 0.25 && redBlue < 0.35 && blueGreen > 1.05 && blueGreen < 1.15 && redGreen > 0.25 && redGreen < 0.35){
            System.out.println("BLUE");
            return "B";
=======
        else if(cGreen > cBlue && cGreen < cRed ) {
            return "R";
>>>>>>> 6298842e2379d439211694ec8d8345eb90ec6f96
        }
        else{
            return "oops";
        }
    }
}
