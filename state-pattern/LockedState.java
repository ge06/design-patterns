package com.company;

public class LockedState implements IState {

    private final Phone phone;

    public LockedState(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void hitLockButton() {
        phone.unlock();
        System.out.println("Unlocked");
    }

    @Override
    public void hitVolumeUpButton() {
        System.out.println("Returned the lock screen");
    }

    @Override
    public void hitVolumeDownButton() {
        System.out.println("Returned the lock screen");
    }

    @Override
    public void hitHomeButton() {
        System.out.println("Returned the lock screen");
    }

    @Override
    public void hitLockButtonWithLongDuration() {
        System.out.println("Returned the lock screen");
    }
}
