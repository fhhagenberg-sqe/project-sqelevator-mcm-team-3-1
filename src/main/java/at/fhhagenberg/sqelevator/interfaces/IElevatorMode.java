/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.fhhagenberg.sqelevator.interfaces;

/**
 *
 * @author jmayr
 */
public interface IElevatorMode {
    public void getNextFloor();
    public void setEnvironment(IEnvironment e);
}
