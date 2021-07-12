package com.company;

public class Phone {

    private final OpenState openState;
    private final ClosedState closedState;
    private final LockedState lockedState;
    private IState currentState;

    public Phone() {
        openState = new OpenState(this);
        closedState = new ClosedState(this);
        lockedState = new LockedState(this);
        currentState = openState;
    }

    public void hitLockButton() {
        currentState.hitLockButton();
    }

    public void hitVolumeUpButton() {
        currentState.hitVolumeUpButton();
    }

    public void hitVolumeDownButton() {
        currentState.hitVolumeDownButton();
    }

    public void hitHomeButton() {
        currentState.hitHomeButton();
    }

    public void hitLockButtonWithLongDuration() {
        currentState.hitLockButtonWithLongDuration();
    }

    public void close() {
        setCurrentState(getClosedState());
    }

    public void open() {
        setCurrentState(getOpenState());
    }

    public void lock() {
        setCurrentState(getLockedState());
    }

    public void unlock() {
        setCurrentState(getOpenState());
    }

    public OpenState getOpenState() {
        return openState;
    }

    public ClosedState getClosedState() {
        return closedState;
    }

    public LockedState getLockedState() {
        return lockedState;
    }

    public IState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }
}
