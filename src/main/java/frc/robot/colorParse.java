package frc.robot;

public class colorParse{
    String colorOutput(int blue, int green, int red){
        double redBlue = red/blue;
        double redGreen = red/green;
        double blueGreen = blue/green;

        if(red < 0 && red > -10 && green < 0 && green > -10 && blue < 0 && blue > -10){
            return "R";
        }
        else if(red < 0 && red > -10 && green < 0 && green > -10 && blue < 0 && blue > -10){
            return "G";
        }
        else if(redBlue > 0.25 && redBlue < 0.35 && blueGreen > 1.05 && blueGreen < 1.15 && redGreen > 0.25 && redGreen < 0.35){
            System.out.println("BLUE");
            return "B";
        }
        else if(red < 0 && red > -10 && green < 0 && green > -10 && blue < 0 && blue > -10){
            return "Y";
        }
        
        return "non";
    }
}
