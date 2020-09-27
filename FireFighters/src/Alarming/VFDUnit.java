/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alarming;
import Box.states;
import Firefighters.Firefighter;
import java.util.ArrayList;
import java.util.List;
import Box.*;
/**
 *
 * @author retsu
 */

public class VFDUnit implements IVFDUnit {
    String unitName;
    String testCode;
    String alarmCode;
    List<Firefighter> myFirefighters;
    BoxContext box;
    
    public VFDUnit(String unitName, String testCode, String alarmCode) {
        this.unitName = unitName;
        this.testCode = testCode;
        this.alarmCode = alarmCode;
        myFirefighters = new ArrayList<>();
        
        myFirefighters.add(new Firefighter("Jan","Kowalski","792"));
        myFirefighters.add(new Firefighter("Pan","Kowalski","791"));
        myFirefighters.add(new Firefighter("Bogdan","Kowalski","790"));
        
        box = new BoxContext(myFirefighters);
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getTestCode() {
        return testCode;
    }

    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

    public String getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode;
    }

    @Override
    public ResponseCode notify(String CCIR_CODE) {
        String unitname = CCIR_CODE.substring(0,10);
        if(unitName.equals(unitname)){
            String receivedCode = CCIR_CODE.substring(10);
            System.out.print(receivedCode);
            
            if(testCode.equals(receivedCode)){
                box.requestAlarm(Box.states.test);
                return ResponseCode.TEST_OK;
            } else if(alarmCode.equals(receivedCode)){
                box.requestAlarm(states.alarm);
                return ResponseCode.ALARM_OK;
            }
        }
        return ResponseCode.ERROR;
    }
    
}
