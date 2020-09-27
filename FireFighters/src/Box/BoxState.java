/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box;

/**
 *
 * @author Użytkownik
 */

public abstract class BoxState {
    protected boolean ringing;
    abstract void doWork();
}