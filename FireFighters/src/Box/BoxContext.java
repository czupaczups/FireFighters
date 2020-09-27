/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box;
import Alarming.*;
import Firefighters.Firefighter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Użytkownik
 */
public class BoxContext {
    private BoxState currentState;
    private List<Firefighter> myFireFighters;
    
    public BoxContext(List<Firefighter> fireFighters){
        myFireFighters = fireFighters;
        currentState = new BoxSilent();
    }
    
    public void requestAlarm(states stateEnum){
        System.out.print("TU\n");
        switch(stateEnum){
            case sleeping:
                currentState = new BoxSilent();
                break;
            case test:
                currentState = new BoxTestState();
                break;
            case alarm:
                currentState = new BoxAlarming(myFireFighters);
                break;
        }
        currentState.doWork();
    }
}
