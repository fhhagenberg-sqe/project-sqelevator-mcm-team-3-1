/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.fhhagenberg.sqelevator.model.dummy;

import at.fhhagenberg.sqelevator.enums.ElevatorModeType;
import at.fhhagenberg.sqelevator.interfaces.IElevatorMode;
import at.fhhagenberg.sqelevator.interfaces.IEnvironment;

/**
 *
 * @author jmayr
 */
public class ElevatorModeManual implements IElevatorMode {

    @Override
    public void setModeType(ElevatorModeType type) {

    }

    @Override
    public ElevatorModeType getModeType() {
        return ElevatorModeType.MANUAL;
    }

}
