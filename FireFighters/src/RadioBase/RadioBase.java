/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadioBase;
import Alarming.VFDUnit;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Użytkownik
 */
public class RadioBase {
    private List<VFDUnit> observers;
    
    public RadioBase(){
        observers = new ArrayList<>();
    }
    
    public void registerObserver(VFDUnit observer){
        observers.add(observer);
    }
    
    public void unregisterObserver(VFDUnit observer){
        observers.remove(observer);
    }
    
    public void notifyObservers(){
        System.out.print("BEGIN\n");
        for(VFDUnit iter : observers){
            String signal = iter.getUnitName();
            signal+=iter.getAlarmCode();
            iter.notify(signal);
        }
    }
}
