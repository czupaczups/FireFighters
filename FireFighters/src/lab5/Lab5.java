/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import Alarming.VFDUnit;
import RadioBase.RadioBase;

/**
 *
 * @author retsu
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("BEGIN\n");
        RadioBase base = new RadioBase();
        base.registerObserver(new VFDUnit("Jednostka1", "1", "2"));
        base.registerObserver(new VFDUnit("Jednostka2", "1", "2"));
        base.registerObserver(new VFDUnit("Jednostka3", "1", "2"));
        base.notifyObservers();
        System.out.print("END\n");
    }
    
}
