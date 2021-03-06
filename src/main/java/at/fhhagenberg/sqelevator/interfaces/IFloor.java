/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.fhhagenberg.sqelevator.interfaces;

import java.beans.PropertyChangeListener;

/**
 * @author jmayr
 */
public interface IFloor {

    public int getFloorNumber();

    public boolean getFloorButtonDown();

    public boolean getFloorButtonUp();

    public void setFloorButtonDown(boolean active);

    public void setFloorButtonUp(boolean active);

    public void addFloorUpdatedListener(PropertyChangeListener listener);

    public void removeFloorUpdatedListener(PropertyChangeListener listener);
}
