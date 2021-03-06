package at.fhhagenberg.sqelevator.controller;

import at.fhhagenberg.sqelevator.LogManager;
import at.fhhagenberg.sqelevator.interfaces.ICoreMapper;

import java.rmi.RemoteException;
import java.util.TimerTask;

public class CoreMapperTimerTask extends TimerTask {

    private ICoreMapper coreMapper;

    public CoreMapperTimerTask(ICoreMapper coreMapper) {
        this.coreMapper = coreMapper;
    }

    @Override
    public void run() {
        try {
            coreMapper.updateEnvironment();
            coreMapper.updateElevators();
            coreMapper.updateFloors();
        } catch (RemoteException rme) {
            LogManager.getLogger().severe("Connection to remote shut down.");
        }
    }
}
