package frc.robot;

public class colorParse{
    String colorOutput(int blue, int green, int red){
        if(red < 0 && red > -10 && green < 0 && green > -10 && blue < 0 && blue > -10){
            return "R";
        }
        else if(red < 0 && red > -10 && green < 0 && green > -10 && blue < 0 && blue > -10){
            return "G";
        }
        else if(red < 0 && red > -10 && green < 0 && green > -10 && blue < 0 && blue > -10){
            return "B";
        }
        else if(red < 0 && red > -10 && green < 0 && green > -10 && blue < 0 && blue > -10){
            return "Y";
        }
        
        return "non";
    }
}
