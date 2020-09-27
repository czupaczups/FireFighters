/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box;
import Firefighters.Firefighter;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Użytkownik
 */ 
public class BoxAlarming extends BoxState{
    private List<Firefighter> myFireFighters;
    public BoxAlarming(List<Firefighter> fireFighters){
        myFireFighters = fireFighters;
        ringing = true;
    }
    @Override void doWork(){
        myFireFighters.forEach((iter) -> {iter.sendSms("ALARM");});
    }
}
